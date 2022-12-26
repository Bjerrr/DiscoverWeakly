package com.dw.DW.playlistBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Token {
    public String createToken() {
        try {
            String urlParameters = "grant_type=client_credentials&client_id=32acd09211cc48d8af2a993aaada5593&client_secret=f374e93467e247978aceb9d2a364689b";
            URL url = new URL("https://accounts.spotify.com/api/token");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Accept", "*/*");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setDoOutput(true);

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());

            writer.write(urlParameters);
            writer.flush();

            String line;
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            while ((line = reader.readLine()) != null) {
                return line.substring(line.indexOf("\":\"") + 3, line.indexOf("\",\""));
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
