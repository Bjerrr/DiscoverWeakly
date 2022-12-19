package com.dw.DW.json_models.trip;

/**
 * Used as origin or destination in json files from ResRobot Routeplanner.
 */
public class Location {
    public String name = "";
    public String type = "";
    public String id = "";
    public String extId = "";
    public double lon = 0d;
    public double lat = 0d;
    public int routeIdx = -1;
    public String time = "";
    public String date = "";

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Location{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", extId='").append(extId).append('\'');
        sb.append(", lon=").append(lon);
        sb.append(", lat=").append(lat);
        sb.append(", routeIdx=").append(routeIdx);
        sb.append(", time='").append(time).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append('}');
        return sb.toString();
    }
}