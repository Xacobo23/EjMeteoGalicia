package org.example;

import java.util.ArrayList;
import java.util.List;

public class Provincia<String> {
    private List<Concello> concellos = new ArrayList<>();
    private String nomeProvincia;

    public Provincia(String nomeProvincia) {
        this.nomeProvincia = nomeProvincia;
    }

    public Provincia() {
    }

    public List<Concello> getConcellos() {
        return concellos;
    }

    public void setConcellos(List<Concello> concellos) {
        this.concellos = concellos;
    }

    public void addConcellos(Concello concello){
        if ((int) (concello.getIdConcello() / Math.pow(10, Math.log10(concello.getIdConcello()) + 1 - 2))==15){

        }
    }

    public String getNomeProvincia() {
        return nomeProvincia;
    }

    public void setNomeProvincia(String nomeProvincia) {
        this.nomeProvincia = nomeProvincia;
    }
}

enum nomeProvincias{

    LUGO("Lugo"), PONTEVEDRA("Pontevedra"), OURENSE("Ourense"), CORUNHA("A Coruña");

    private String nome;

    nomeProvincias(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
