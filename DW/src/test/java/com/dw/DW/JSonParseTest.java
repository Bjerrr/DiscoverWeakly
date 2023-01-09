package com.dw.DW;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class JSonParseTest {
    Gson gson;

    void run() {
        gson = new Gson();
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
