package com.dw.DW.json_models.trip;

import java.util.ArrayList;

public class Trip {
    public ArrayList<ServiceDays> ServiceDays = new ArrayList<>();
    public LegList LegList;

    public Trip() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trip{");
        sb.append("ServiceDays=").append(ServiceDays);
        sb.append(", LegList=").append(LegList);
        sb.append('}');
        return sb.toString();
    }
}
