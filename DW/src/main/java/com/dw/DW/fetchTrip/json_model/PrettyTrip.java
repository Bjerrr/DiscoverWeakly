package com.dw.DW.fetchTrip.json_model;

import java.util.ArrayList;

public class PrettyTrip {
    public String origin;
    public String destination;
    public String travelTime;
    public ArrayList<Leg> journey = new ArrayList<>();

    public PrettyTrip() { }
}
