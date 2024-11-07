package org.example;

public class PeriodoMTN {
    private int manha;
    private int noite;
    private int tarde;

    public PeriodoMTN(int manha, int noite, int tarde) {
        this.manha = manha;
        this.noite = noite;
        this.tarde = tarde;
    }

    public int getManha() {
        return manha;
    }

    public void setManha(int manha) {
        this.manha = manha;
    }

    public int getNoite() {
        return noite;
    }

    public void setNoite(int noite) {
        this.noite = noite;
    }

    public int getTarde() {
        return tarde;
    }

    public void setTarde(int tarde) {
        this.tarde = tarde;
    }

    @Override
    public String toString() {
        return //this.getClass().getSimpleName()+
                "(" +
                "manha: " + manha +
                ", noite: " + noite +
                ", tarde: " + tarde +
                ')';
    }
}
