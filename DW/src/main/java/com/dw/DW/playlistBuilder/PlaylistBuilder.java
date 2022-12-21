package com.dw.DW.playlistBuilder;

import com.dw.DW.GENERATED_POJOS.JsonTrip.JsonTripRoot;
import com.dw.DW.GENERATED_POJOS.JsonTrip.Trip;
import com.dw.DW.fetchTrip.FetchTrip;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class PlaylistBuilder {
    static List<String> playlist = new ArrayList<>();

    public List<String> createPlaylist(int timeLimit) {
        try {
            URL url = new URL("https://api.spotify.com/v1/search?q=Linkin+Park&type=track&access_token=BQDjtqX8Fg6I_vAbT--LgopvCdMiL-jx32gSPOLQE88csrJug1TLlj31fpByu-aiiRkew6XAs4yrBQt9HyqosXO-ZqsOri0QeSztLAT6nKocXDnx60XJmht4Z11lmplKra5odByDF7U5cqUJ2II6dPqyGKvpzVUQhlCLCQhDLOPym_39WczqR7xE3dOZxqvBe0HVpCNUhIaL0ZX0WTRzvEMW0EPzg6nieK-rX9e1OVRBjbKbsr9h");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("accept", "application/json");
            InputStream responseStream = con.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseStream));

            int timeTotal = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("duration")) {
                    timeTotal += Integer.parseInt(line.replaceAll("[^\\d.]", ""))/1000;
                    System.out.println(timeTotal + " of total: " + timeLimit);
                } else if (line.contains("\"spotify\"")) {
                    playlist.add(line.substring(line.indexOf("\"h")+1,line.length()-1));
                } else if (timeTotal >= timeLimit) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return playlist;
    }

    public static void main(String[] args) {
        TimeCalculator timeCalculator = new TimeCalculator();
        FetchTrip fetchTrip = new FetchTrip();

        String rawJson = fetchTrip.getTrip("Malmö", "Hässleholm");
        JsonTripRoot jsonRoot = new Gson().fromJson(rawJson, JsonTripRoot.class);

        Trip trip = jsonRoot.getTrip().get(0);
        String tripDeparture = trip.getOrigin().getTime();
        String tripArrival = trip.getDestination().getTime();

        PlaylistBuilder playlistBuilder = new PlaylistBuilder();
        playlist = playlistBuilder.createPlaylist(timeCalculator.calculateTime(tripDeparture,tripArrival));
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.get(i));
        }
    }
}
