package com.dw.DW.json_models.trip;

import java.util.ArrayList;

public class JsonTrip {
    public ArrayList<Trip> Trip = new ArrayList<>();

    public JsonTrip() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JsonTrip{");
        sb.append("Trip=").append(Trip);
        sb.append('}');
        return sb.toString();
    }
}
