package com.dw.DW.json_models.trip;

import java.util.ArrayList;

public class LegList {
    public ArrayList<Leg> Leg = new ArrayList<>();
    public String srcB = "";
    public String srcF = "";

    public LegList() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LegList{");
        sb.append("Leg=").append(Leg);
        sb.append(", srcB='").append(srcB).append('\'');
        sb.append(", srcF='").append(srcF).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
