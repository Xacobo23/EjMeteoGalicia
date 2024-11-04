package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(PrediccionDia.class, new PrediccionDiaAdapter())
                .setPrettyPrinting()
                .create();

        PrediccionDia p = new PrediccionDia();

        PrediccionDia p1 =gson.fromJson(new JsonReader(new InputStreamReader(new FileInputStream(new File("./src/prediccion.json")))), PrediccionDia.class);
        System.out.println("p1 = " + p1);

        String json = gson.toJson(p1);
        System.out.println("json = " + json);
    }
}