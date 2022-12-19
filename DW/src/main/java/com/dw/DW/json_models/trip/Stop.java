package com.dw.DW.json_models.trip;

public class Stop {
    public String name = "";
    public String id = "";
    public String extId = "";
    public int routeIdx = -1;
    public double lon = 0d;
    public double lat = 0d;
    public String depTime = "";
    public String depDate = "";
    public String arrTime = "";
    public String arrDate = "";

    public Stop() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stop{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", extId='").append(extId).append('\'');
        sb.append(", routeIdx=").append(routeIdx);
        sb.append(", lon=").append(lon);
        sb.append(", lat=").append(lat);
        sb.append(", depTime='").append(depTime).append('\'');
        sb.append(", depDate='").append(depDate).append('\'');
        sb.append(", arrTime='").append(arrTime).append('\'');
        sb.append(", arrDate='").append(arrDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
