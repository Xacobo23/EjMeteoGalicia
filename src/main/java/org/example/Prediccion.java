package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class Prediccion {
    private int idConcello;
    private List<PrediccionDia> listPred;
    private String nomeConcello;

    public Prediccion() {
    }

    public Prediccion(int idConcello, List<PrediccionDia> listPred, String nomeConcello) {
        this.idConcello = idConcello;
        this.listPred = listPred;
        this.nomeConcello = nomeConcello;
    }

    public int getIdConcello() {
        return idConcello;
    }

    public void setIdConcello(int idConcello) {
        this.idConcello = idConcello;
    }

    public List<PrediccionDia> getListPred() {
        return listPred;
    }

    public void setListPred(List<PrediccionDia> listPred) {
        this.listPred = listPred;
    }

    public String getNomeConcello() {
        return nomeConcello;
    }

    public void setNomeConcello(String nomeConcello) {
        this.nomeConcello = nomeConcello;
    }

    @Override
    public String toString() {
        return "Prediccion{" +
                "idConcello=" + idConcello +
                ", listPred=" + listPred +
                ", nomeConcello='" + nomeConcello + '\'' +
                '}';
    }
}
