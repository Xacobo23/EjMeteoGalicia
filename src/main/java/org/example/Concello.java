package org.example;

public class Concello {
    private int idConcello;
    private String nomeConcello;

    public Concello() {
    }

    public Concello(String nomeConcello, int idConcello) {
        this.nomeConcello = nomeConcello;
        this.idConcello = idConcello;
    }

    public int getIdConcello() {
        return idConcello;
    }

    public void setIdConcello(int idConcello) {
        this.idConcello = idConcello;
    }

    public String getNomeConcello() {
        return nomeConcello;
    }

    public void setNomeConcello(String nomeConcello) {
        this.nomeConcello = nomeConcello;
    }
}
