package com.dw.DW;

import com.dw.DW.json_models.trip.JsonTrip;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class JSonParseTest {
    Gson gson;

    void run() {
        gson = new Gson();

        JsonTrip jsonTrip = AssertJsonSuccess("DW/src/test/resources/trip.json", JsonTrip.class);
        String originName = jsonTrip.Trip.get(0).LegList.Leg.get(0).Origin.name;
        System.out.println(originName);

        //AssertJsonSuccess("DW/src/test/resources/trip.json", Json);
    }

    private <T> T AssertJsonSuccess(String path, Class<T> tClass) {
        T dataModel = jsonFileToObject(path, tClass);

        assert dataModel != null;
        System.out.println(dataModel);

        return dataModel;
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
