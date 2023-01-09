package com.dw.DW.playlistBuilder;

import java.time.LocalTime;

public class TimeCalculator {

    public static int calculateTime(String departure, String arrival) {

        LocalTime aTime = LocalTime.parse(arrival);
        LocalTime dTime = LocalTime.parse(departure);

        if (aTime.toSecondOfDay() < dTime.toSecondOfDay()) {
            return (86400 - dTime.toSecondOfDay()) + aTime.toSecondOfDay();
        }
        return aTime.toSecondOfDay() - dTime.toSecondOfDay();
    }

}
