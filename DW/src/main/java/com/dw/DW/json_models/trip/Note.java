package com.dw.DW.json_models.trip;

public class Note {
    public String value = "";
    public String key = "";
    public String type = "";
    public int priority = -1;
    public int routeIdxFrom = -1;
    public int routeIdxTo = -1;

    public Note() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Note{");
        sb.append("value='").append(value).append('\'');
        sb.append(", key='").append(key).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", priority=").append(priority);
        sb.append(", routeIdxFrom=").append(routeIdxFrom);
        sb.append(", routeIdxTo=").append(routeIdxTo);
        sb.append('}');
        return sb.toString();
    }
}
