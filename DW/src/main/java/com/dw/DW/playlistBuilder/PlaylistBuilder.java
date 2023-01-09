package com.dw.DW.playlistBuilder;

import com.dw.DW.GENERATED_POJOS.Recommendations.RecommendationsRoot;
import com.dw.DW.GENERATED_POJOS.Recommendations.Track;
import com.dw.DW.playlistBuilder.json_model.PrettyTrack;
import com.google.gson.Gson;

import java.io.*;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlaylistBuilder {
    private static List<String> playlist = new ArrayList<>();
    private String token;
    private int timeTotal;
    private final Random random = new Random();
    private final Token tokenCreator = new Token();

    public List<String> createPlaylist(int timeLimit) {
        playlist = new ArrayList<>();
        String[] genres = getRandomGenres();
        token = tokenCreator.createToken();
        timeTotal = 0;

        while (timeLimit > timeTotal) {
            addSongs(timeLimit,genres);
        }

        return playlist;
    }

    public void addSongs(int timeLimit, String[] genres) {

        String genreQuery = genres[0];
        for (int i = 1; i < 5; i++) {
            genreQuery += "," + genres[i];
        }

        try {
            URL url = new URL("https://api.spotify.com/v1/recommendations?limit=100&max_popularity=20&seed_genres=" + genreQuery + "&access_token=" + token);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("accept", "application/json");
            InputStream responseStream = con.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseStream));

            String line;
            String name = null;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("\"duration_ms\"")) {
                    timeTotal += Integer.parseInt(line.replaceAll("[^\\d.]", ""))/1000;
                    System.out.println(timeTotal + " of total: " + timeLimit);
                } else if (line.contains("\"name\"")) {
                    name = line.substring(line.indexOf(": \"")+3,line.length()-2);
                } else if (line.contains("type") && line.contains("track")) {
                    playlist.add(name);
                } else if (timeTotal >= timeLimit) {
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<PrettyTrack> getPlaylist(int desiredDuration_ms, String access_token) throws IOException {

        Gson gson = new Gson();
        RecommendationsRoot jsonObject = gson.fromJson(getJsonResponseReader(), RecommendationsRoot.class);
        if(jsonObject == null)
            return null;

        int totalDuration = 0;
        ArrayList<PrettyTrack> tracks = new ArrayList<>();
        while (totalDuration < desiredDuration_ms) {
            for (Track t : jsonObject.getTracks()) {
                PrettyTrack track = new PrettyTrack();
                track.name = t.getName() + " by " + t.getArtists().get(0).getName();
                track.uri = t.getUri();
                track.url = t.getExternalUrls().getSpotify();

                tracks.add(track);
                totalDuration += t.getDurationMs();
                if(totalDuration >= desiredDuration_ms)
                    break;
            }
        }

        if(!access_token.equals("")) {
            System.out.println("AUTHORIZED! PLAYLIST MAKING!");

            // We should make a playlist!
            String playListId = createSpotifyPlaylist(access_token);
            String playListUrl = "https://open.spotify.com/playlist/" + playListId;

            // Add songs to the playlist
            addSongsToPlaylist(playListId, tracks, access_token);

            // Return a link to the playlist instead
            PrettyTrack dummyTrack = new PrettyTrack();
            dummyTrack.url = playListUrl;
            dummyTrack.name = "Your Discover Weakly playlist!";
            ArrayList<PrettyTrack> dummyList = new ArrayList<>();
            dummyList.add(dummyTrack);
            return dummyList;
        }
        return tracks;
    }

    private void addSongsToPlaylist(String playListId, ArrayList<PrettyTrack> tracks, String access_token) throws IOException {
        System.out.println("# of songs to add: " + tracks.size());
        while (tracks.size() > 20) {
            System.out.println("adding 20 first..");
            // take the first 20, and add them
            ArrayList<PrettyTrack> subList = new ArrayList<>(tracks.subList(0, 20));
            addUpTo20SongsToPlaylist(playListId, subList, access_token);

            tracks = new ArrayList<>(tracks.subList(20, tracks.size()));
        }
        System.out.println("adding the rest: " + tracks.size());
        // add the rest
        addUpTo20SongsToPlaylist(playListId, tracks, access_token);
    }

    private void addUpTo20SongsToPlaylist(String playListId, ArrayList<PrettyTrack> tracks, String access_token) throws IOException {
        String urlString = "https://api.spotify.com/v1/playlists/" + playListId + "/tracks";
        ArrayList<String> uris = new ArrayList<>();
        //urlString += "?uris=";
        for (PrettyTrack t : tracks) {
            uris.add(t.uri); // += t.uri + ",";
        }
        String jsonString = new Gson().toJson(uris);
        System.out.println("jsonString: ");
        System.out.println(jsonString);

        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Authorization", "Bearer " + access_token);
        con.setRequestProperty("Content-Type", "application/json");
        //con.setRequestProperty("Content-Length", "0");

        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(jsonString.getBytes(StandardCharsets.UTF_8));
        os.flush();

        int http_status = con.getResponseCode();
        System.out.println("addSongsToPlaylist: " + http_status);

        InputStream inputStream = null;
        if(http_status < 299) {
            System.out.println("InputStream!");
            inputStream = con.getInputStream();

            BufferedReader contentReader = new BufferedReader(new InputStreamReader(inputStream));

            String user_id = "";
            String output;
            while ((output = contentReader.readLine()) != null) {
                System.out.println(output);
            }
        } else {
            System.out.println("ErrorStream!");
            inputStream = con.getErrorStream();

            BufferedReader contentReader = new BufferedReader(new InputStreamReader(inputStream));

            String user_id = "";
            String output;
            while ((output = contentReader.readLine()) != null) {
                System.out.println(output);
            }
        }
    }

    private String createSpotifyPlaylist(String access_token) throws IOException {
        String playListUrl = "";

        // Get current user ID
        String user_id = getUserId(access_token);

        // Create spotify playlist
        return createSpotifyPlaylist(access_token, user_id);
    }

    private String getUserId(String access_token) throws IOException {
        URL meUrl = new URL("https://api.spotify.com/v1/me");
        HttpURLConnection con = (HttpURLConnection) meUrl.openConnection();
        con.setRequestProperty("Authorization", "Bearer " + access_token);
        con.setRequestProperty("Content-Type", "application/json");

        int http_status = con.getResponseCode();
        System.out.println("getUserId: " + http_status);

        InputStream inputStream = null;
        if(http_status < 299) {
            inputStream = con.getInputStream();
        } else {
            inputStream = con.getErrorStream();
        }
        BufferedReader contentReader = new BufferedReader(new InputStreamReader(inputStream));

        String user_id = "";
        String output;
        while ((output = contentReader.readLine()) != null) {
            if(output.contains("id")) {
                user_id = output.substring(10, output.length() - 2);
                System.out.println("user_id: " + user_id);
                break;
            }
        }
        return user_id;
    }

    private String createSpotifyPlaylist(String access_token, String user_id) throws IOException {
        URL url = new URL("https://api.spotify.com/v1/users/" + user_id + "/playlists");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Authorization", "Bearer " + access_token);
        con.setRequestProperty("Content-Type", "application/json");

        String rawJson = "{ \"name\" : \"discoverWeakly\" }";
        System.out.println("rawJson: ");
        System.out.println(rawJson);

        con.setDoOutput(true);
        con.getOutputStream().write(rawJson.getBytes(StandardCharsets.UTF_8));
        con.getOutputStream().flush();

        int http_status = con.getResponseCode();
        System.out.println("createSpotifyUrl: " + http_status);

        InputStream inputStream = null;
        if(http_status < 299) {
            inputStream = con.getInputStream();
        } else {
            inputStream = con.getErrorStream();
        }
        BufferedReader contentReader = new BufferedReader(new InputStreamReader(inputStream));

        String playlist_id = "";
        String output;
        while ((output = contentReader.readLine()) != null) {
            if(output.contains("id")) {
                playlist_id = output.substring(10, output.length() - 2);
                System.out.println("playlist_id: " + playlist_id);
                break;
            }
        }
        return playlist_id;
    }

    private Reader getJsonResponseReader() throws IOException {
        token = tokenCreator.createToken();

        String[] genres = getRandomGenres();
        StringBuilder genreQuery = new StringBuilder(genres[0]);
        for (int i = 1; i < 5; i++) {
            genreQuery.append(",").append(genres[i]);
        }

        String urlString = "https://api.spotify.com/v1/recommendations?";
        urlString += "?limit=5";
        urlString += "&max_popularity=15";
        urlString += "&target_popularity=0";
        urlString += "&seed_genres=" + genreQuery;
        urlString += "&market=SE";
        urlString += "&access_token=" + token;

        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("accept", "application/json");
        InputStream responseStream = con.getInputStream();

        return new BufferedReader(new InputStreamReader(responseStream));
    }

    public String[] getRandomGenres() {
        String[] list = {"acoustic","afrobeat","alt-rock","alternative","ambient","anime","black-metal","bluegrass","blues","bossanova","brazil","breakbeat","british","cantopop","chicago-house","children","chill","classical","club","comedy","country","dance","dancehall","death-metal","deep-house","detroit-techno","disco","disney","drum-and-bass","dub","dubstep","edm","electro","electronic","emo","folk","forro","french","funk","garage","german","gospel","goth","grindcore","groove","grunge","guitar","happy","hard-rock","hardcore","hardstyle","heavy-metal","hip-hop","holidays","honky-tonk","house","idm","indian","indie","indie-pop","industrial","iranian","j-dance","j-idol","j-pop","j-rock","jazz","k-pop","kids","latin","latino","malay","mandopop","metal","metal-misc","metalcore","minimal-techno","movies","mpb","new-age","new-release","opera","pagode","party","philippines-opm","piano","pop","pop-film","post-dubstep","power-pop","progressive-house","psych-rock","punk","punk-rock","r-n-b","rainy-day","reggae","reggaeton","road-trip","rock","rock-n-roll","rockabilly","romance","sad","salsa","samba","sertanejo","show-tunes","singer-songwriter","ska","sleep","songwriter","soul","soundtracks","spanish","study","summer","swedish","synth-pop","tango","techno","trance","trip-hop","turkish","work-out","world-music"};
        String[] seeds = new String[5];
        for (int i = 0; i < 5; i++) {
            seeds[i] = list[random.nextInt(list.length)];
        }
        return seeds;
    }
}
