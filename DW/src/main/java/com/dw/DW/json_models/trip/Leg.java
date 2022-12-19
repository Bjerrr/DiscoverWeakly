package com.dw.DW.json_models.trip;

public class Leg {
    public Location Origin;
    public Location Destination;
    public Notes Notes;
    public Product Product;
    public Stops Stops;

    public String idx = "";
    public String name = "";
    public String transportNumber = "";
    public String transportCategory = "";
    public String type = "";
    public boolean reachable;
    public String direction = "";

    public Leg() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Leg{");
        sb.append("Origin=").append(Origin);
        sb.append(", Destination=").append(Destination);
        sb.append(", Notes=").append(Notes);
        sb.append(", Product=").append(Product);
        sb.append(", Stops=").append(Stops);
        sb.append(", idx='").append(idx).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", transportNumber='").append(transportNumber).append('\'');
        sb.append(", transportCategory='").append(transportCategory).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", reachable=").append(reachable);
        sb.append(", direction='").append(direction).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
