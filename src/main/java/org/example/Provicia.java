package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Provicia{
    private String nomeProvincia;

    private List<Concello> concellosLugo = new ArrayList<>();
    private List<Concello> concellosCorunha = new ArrayList<>();
    private List<Concello> concellosPontevedra = new ArrayList<>();
    private List<Concello> concellosOurense = new ArrayList<>();

    public Provicia() {
    }

    public Provicia(String nomeProvincia) {
        this.nomeProvincia = nomeProvincia;
    }


    public void addConcellos(Concello concello) {
        int id = concello.getIdConcello();
        /*
        Coruña 15
        Lugo 27
        Ourense 32
        Pontevedra 36
         */
        if ((int) (id / Math.pow(10, Math.log10(id) + 1 - 2))==15){
            concellosCorunha.add(concello);
        } else if ((int) (id / Math.pow(10, Math.log10(id) + 1 - 2)) == 27) {
            concellosLugo.add(concello);
        } else if ((int) (id / Math.pow(10, Math.log10(id) + 1 - 2))==32){
            concellosOurense.add(concello);
        } else if ((int) (id / Math.pow(10, Math.log10(id) + 1 - 2)) == 36) {
            concellosPontevedra.add(concello);
        }
    }
}

enum Provincias {
    LUGO("Lugo"), CORUNHA("A Coruña"), PONTEVEDRA("Pontevedra"), OURENSE("Ourense");

    private final String nome;
    Provincias(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static Provincias getProvicias(String nome){
        return Arrays.stream(Provincias.values()).
                filter(v -> nome.equalsIgnoreCase(v.getNome()))
                .findFirst().orElse(null);
    }
    @Override
    public String toString() {
        return nome;
    }
}
