package com.dw.DW.json_models.trip;

import java.util.ArrayList;

public class Notes {
    public ArrayList<Note> Note = new ArrayList<>();

    public Notes() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notes{");
        sb.append("Note=").append(Note);
        sb.append('}');
        return sb.toString();
    }
}
