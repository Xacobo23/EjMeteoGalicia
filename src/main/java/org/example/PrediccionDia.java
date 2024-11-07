package org.example;

import java.time.LocalDateTime;

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
        StringBuilder sb = new StringBuilder();
        sb
                .append(dataPredivion).append(" (aviso: ").append(nivelAviso)
                .append("), Máxima: ").append(tMax)
                .append(", Mínima: ").append(tMin)
                .append(", Índice ultravioleta máx: ")
                .append(uvMax)
                .append(System.lineSeparator())

                .append("Ceo: ").append(ceo).append(System.lineSeparator())
                .append("Choiva: ").append(pChoiva).append(System.lineSeparator())
                .append("Temperaturas máximas: ").append(tMaxFranxa).append(System.lineSeparator())
                .append("Temperaturas máximas: ").append(tMinFranxa).append(System.lineSeparator())
                .append("Vento: ").append(vento).append(System.lineSeparator());

        return sb.toString();
    }
}

class Ceo extends PeriodoMTN {
    public Ceo(int manha, int noite, int tarde) {
        super(manha, noite, tarde);
    }
}
class PChoiva extends PeriodoMTN {
    public PChoiva(int manha, int noite, int tarde) {
        super(manha, noite, tarde);
    }
}
class Franxa extends PeriodoMTN {
    public Franxa(int manha, int noite, int tarde) {
        super(manha, noite, tarde);
    }
}
class Vento extends PeriodoMTN {
    public Vento(int manha, int noite, int tarde) {
        super(manha, noite, tarde);
    }
}

