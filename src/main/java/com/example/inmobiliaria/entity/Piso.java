package com.example.inmobiliaria.entity;

public class Piso {

    private short numeroPiso;
    private float superficie;
    private String puerta, codigoCatastral, estadoDeUso;

    public Piso() {
    }

    public Piso(short numeroPiso, String puerta, float superficie, String codigoCatastral, String estadoDeUso) {
        this.numeroPiso = numeroPiso;
        this.superficie = superficie;
        this.puerta = puerta;
        this.codigoCatastral = codigoCatastral;
        this.estadoDeUso = estadoDeUso;
    }

    public short getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(short numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getCodigoCatastral() {
        return codigoCatastral;
    }

    public void setCodigoCatastral(String codigoCatastral) {
        this.codigoCatastral = codigoCatastral;
    }

    public String getEstadoDeUso() {
        return estadoDeUso;
    }

    public void setEstadoDeUso(String estadoDeUso) {
        this.estadoDeUso = estadoDeUso;
    }

    @Override
    public String toString() {
        return "Piso [numeroPiso=" + numeroPiso + ", superficie=" + superficie + ", puerta=" + puerta
                + ", codigoCatastral=" + codigoCatastral + ", estadoDeUso=" + estadoDeUso + "]";
    }

}
