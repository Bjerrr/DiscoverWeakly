package com.dw.DW.playlistBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCalculator {

    SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");

    public int calculateTime(String departure, String arrival) {

        try {
            Date dTime = sf.parse(departure);
            Date aTime = sf.parse(arrival);
            return (int) ((aTime.getTime()-dTime.getTime())/1000);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
