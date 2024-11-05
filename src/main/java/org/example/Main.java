package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static final String URL = "https://servizos.meteogalicia.gal/mgrss/predicion/" +"jsonPredConcellos.action?idConc=15078&request_locale=gl";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Prediccion.class, new PrediccionConcelloAdapter())
                .setPrettyPrinting()
                .create();

//        PrediccionDia p = new PrediccionDia();
//
//        PrediccionDia p1 =gson.fromJson(new JsonReader(new InputStreamReader(new FileInputStream(new File("./src/prediccion.json")))), PrediccionDia.class);
//        System.out.println("p1 = " + p1);
//
//        String json = gson.toJson(p1);
//        System.out.println("json = " + json);

        
        InputStream inputURL = new URI(URL).toURL().openConnection().getInputStream();

        BufferedReader is = new BufferedReader(new InputStreamReader(inputURL));
        
//        String inputLine;
//        StringBuilder content = new StringBuilder();
//        while ((inputLine = is.readLine()) != null) {
//            content.append(inputLine);
//        }
//        is.close();
        


        Prediccion p = gson.fromJson(new JsonReader(is), Prediccion.class);
        System.out.println("p = " + p);

//        System.out.println(content);
        
        
        
        

    }
}