package com.dw.DW.fetchTrip;

import com.dw.DW.stopLockup.StopLookup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class FetchTrip {

    StopLookup stopLookup = new StopLookup();

    public String getTrip(String origin, String destination) {
        try {
            origin = stopLookup.getStopID(origin);
            destination = stopLookup.getStopID(destination);
            URL url = new URL("https://api.resrobot.se/v2.1/trip?format=json&originId=" + origin + "&destId=" + destination + "&passlist=true&showPassingPoints=true&accessId=e2656839-ee40-4eb9-9f21-637bf8f2ff72");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("accept", "application/json");
            InputStream responseStream = con.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseStream));

            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        FetchTrip fetchTrip = new FetchTrip();
        System.out.println(fetchTrip.getTrip("Hässleholm Centralstation", "Malmö Centralstation"));
    }
}
