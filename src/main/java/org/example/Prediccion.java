package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class Prediccion {
    private int idConcello;
    private List<PrediccionDia> listPred;
    private String nomeConcello;

    public static void main(String[] args) {
        PrediccionDia p = new PrediccionDia();
        Ceo ceo = new Ceo();
        p.setCeo(new Ceo());
        System.out.println("p = " + p);

        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create() ;
        System.out.println(gson.toJson(p));
    }

}
