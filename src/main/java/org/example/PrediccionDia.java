package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PrediccionDia {
    private Ceo ceo;
    private LocalDateTime dataPredivion;
    private int nivelAviso;
    private PChoiva pChoiva;
    private int tMax;
    private int tMin;
    private Franxa tMaxFranxa;
    private Franxa tMinFranxa;
    private int uvMax;
    private Vento vento;

    public PrediccionDia() {
    }

    public Ceo getCeo() {
        return ceo;
    }

    public void setCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    public LocalDateTime getDataPredivion() {
        return dataPredivion;
    }

    public void setDataPredivion(LocalDateTime dataPredivion) {
        this.dataPredivion = dataPredivion;
    }

    public int getNivelAviso() {
        return nivelAviso;
    }

    public void setNivelAviso(int nivelAviso) {
        this.nivelAviso = nivelAviso;
    }

    public PChoiva getpChoiva() {
        return pChoiva;
    }

    public void setpChoiva(PChoiva pChoiva) {
        this.pChoiva = pChoiva;
    }

    public int gettMax() {
        return tMax;
    }

    public void settMax(int tMax) {
        this.tMax = tMax;
    }

    public int gettMin() {
        return tMin;
    }

    public void settMin(int tMin) {
        this.tMin = tMin;
    }

    public Franxa gettMaxFranxa() {
        return tMaxFranxa;
    }

    public void settMaxFranxa(Franxa tMaxFranxa) {
        this.tMaxFranxa = tMaxFranxa;
    }

    public Franxa gettMinFranxa() {
        return tMinFranxa;
    }

    public void settMinFranxa(Franxa tMinFranxa) {
        this.tMinFranxa = tMinFranxa;
    }

    public int getUvMax() {
        return uvMax;
    }

    public void setUvMax(int uvMax) {
        this.uvMax = uvMax;
    }

    public Vento getVento() {
        return vento;
    }

    public void setVento(Vento vento) {
        this.vento = vento;
    }

    @Override
    public String toString() {
        return "PrediccionDia{" +
                "ceo=" + ceo +
                ", dataPredivion='" + dataPredivion + '\'' +
                ", nivelAviso=" + nivelAviso +
                ", pChoiva=" + pChoiva +
                ", tMax=" + tMax +
                ", tMin=" + tMin +
                ", tMaxFranxa=" + tMaxFranxa +
                ", tMinFranxa=" + tMinFranxa +
                ", uvMax=" + uvMax +
                ", vento=" + vento +
                '}';
    }
}

class Ceo{
    private int manha;
    private int noite;
    private int tarde;

    public Ceo() {
    }

    public Ceo(int manha, int noite, int tarde) {
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
        return "Ceo{" +
                "manha=" + manha +
                ", noite=" + noite +
                ", tarde=" + tarde +
                '}';
    }
}
class PChoiva{
    private int manha;
    private int noite;
    private int tarde;

    public PChoiva() {
    }

    public PChoiva(int manha, int noite, int tarde) {
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
        return "PChoiva{" +
                "manha=" + manha +
                ", noite=" + noite +
                ", tarde=" + tarde +
                '}';
    }
}
class Franxa{
    private int manha;
    private int noite;
    private int tarde;

    public Franxa() {
    }

    public Franxa(int manha, int noite, int tarde) {
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
        return "Franxa{" +
                "manha=" + manha +
                ", noite=" + noite +
                ", tarde=" + tarde +
                '}';
    }
}
class Vento{
    private int manha;
    private int noite;
    private int tarde;

    public Vento() {
    }

    public Vento(int manha, int noite, int tarde) {
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
        return "Vento{" +
                "manha=" + manha +
                ", noite=" + noite +
                ", tarde=" + tarde +
                '}';
    }
}

