package com.dw.DW;

import com.dw.DW.GENERATED_POJOS.JsonTrip.JsonTripRoot;
import com.dw.DW.fetchTrip.FetchTrip;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class JSonParseTest {
    Gson gson;

    void run() {
        gson = new Gson();

        String rawJsonTrip = new FetchTrip().getTrip("Hässleholm Centralstation", "Malmö Centralstation");
        System.out.println(rawJsonTrip);

        JsonTripRoot jsonTripObject = gson.fromJson(rawJsonTrip, JsonTripRoot.class);
        System.out.println(jsonTripObject);

        // String tripOriginName = jsonTripObject.getTrip().get(0).getOrigin().getName();
    }

    private <T> T jsonFileToObject(String filepath, Class<T> tClass) {
        try (JsonReader jsonReader = new JsonReader(new FileReader(filepath))) {
            return gson.fromJson(jsonReader, tClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSonParseTest() {
        gson = new Gson();
    }

    public static void main(String[] args) {
        new JSonParseTest().run();
    }
}
