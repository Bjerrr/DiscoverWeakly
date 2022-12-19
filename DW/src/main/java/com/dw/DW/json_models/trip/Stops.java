package com.dw.DW.json_models.trip;

import java.util.ArrayList;

public class Stops {
    public ArrayList<Stop> Stop = new ArrayList<>();

    public Stops() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stops{");
        sb.append("Stop=").append(Stop);
        sb.append('}');
        return sb.toString();
    }
}
