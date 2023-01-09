package com.dw.DW.SpotifyOAuth;

import com.dw.DW.DwApplication;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// TODO: Finish this, auto set the access_token to a newly acquired token from Spotify API..
public class TokenRefresher {

    private int expireTime;
    private String refreshToken;
    private DwApplication appInstance;

    private Thread t;

    public TokenRefresher(String refreshToken, int expireTime, DwApplication appInstance) {
        this.refreshToken = refreshToken;
        this.expireTime = expireTime;
        this.appInstance = appInstance;

        t = new Thread(new AutoRefresher());
        t.start();
    }

    private void setAccessToken(String newToken) {
        appInstance.access_token = newToken;
    }

    private String getAccessToken() throws IOException {
        URL url = new URL("");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        return "";
    }

    class AutoRefresher implements Runnable {

        @Override
        public void run() {
            System.out.println("AutoRefresher started!");

            while (true) {
                try {

                    t.wait((expireTime * 1000L) / 2L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
