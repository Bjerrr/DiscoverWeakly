package com.dw.DW.stopLockup;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StopLookup {

    public String getStopID (String stopName) throws IOException {
        try {

            File fileDir = new File("DW/src/main/java/com/dw/DW/stopLockup/stops.txt");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));

            String strCurrentLine;

            while ((strCurrentLine = reader.readLine()) != null) {
                if (strCurrentLine.contains(stopName)) {
                    stopName = strCurrentLine.substring(0,strCurrentLine.indexOf(","));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return stopName;
    }

    public static void main(String[] args) {
        StopLookup stopLookup = new StopLookup();
        try {
            System.out.println(stopLookup.getStopID("Norrköping Centralstation"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
