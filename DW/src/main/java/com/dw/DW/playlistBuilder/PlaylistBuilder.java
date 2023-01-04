package com.dw.DW.playlistBuilder;

import com.dw.DW.GENERATED_POJOS.Recommendations.RecommendationsRoot;
import com.dw.DW.GENERATED_POJOS.Recommendations.Track;
import com.dw.DW.playlistBuilder.json_model.PrettyTrack;
import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
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

    public ArrayList<PrettyTrack> getPlaylist(int desiredDuration_ms) throws IOException {

        Gson gson = new Gson();
        RecommendationsRoot jsonObject = gson.fromJson(getJsonResponseReader(), RecommendationsRoot.class);
        if(jsonObject == null)
            return null;

        int totalDuration = 0;
        ArrayList<PrettyTrack> tracks = new ArrayList<>();
        for (Track t : jsonObject.getTracks()) {
            PrettyTrack track = new PrettyTrack();
            track.name = t.getName() + " by " + t.getArtists().get(0).getName();
            track.uri = t.getUri();
            track.url = t.getExternalUrls().getSpotify();
            track.duration_ms = t.getDurationMs();

            tracks.add(track);
            totalDuration += track.duration_ms;
            if(totalDuration >= desiredDuration_ms)
                break;
        }

        return tracks;
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
