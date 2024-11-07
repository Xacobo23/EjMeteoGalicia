package org.example;

public class Concello {
    private int idConcello;
    private String nomeConcello;
    private String nomeProvincia;

    public Concello() {
    }

    public Concello(String nomeConcello, int idConcello) {
        this.nomeConcello = nomeConcello;
        this.idConcello = idConcello;
    }

    public Concello(int idConcello, String nomeConcello, String nomeProvincia) {
        this.idConcello = idConcello;
        this.nomeConcello = nomeConcello;
        this.nomeProvincia = nomeProvincia;
    }

    public String getNomeProvincia() {
        return nomeProvincia;
    }

    public void setNomeProvincia(String nomeProvincia) {
        this.nomeProvincia = nomeProvincia;
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
