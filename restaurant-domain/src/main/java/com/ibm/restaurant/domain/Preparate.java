package com.ibm.restaurant.domain;

public class Preparate {

    private int id;
    private String nume;
    private String descriere;
    private double pret;
    private String listaIngrediente;

    public Preparate(int id, String nume, String descriere, double pret, String listaIngrediente) {
        this.id = id;
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
        this.listaIngrediente = listaIngrediente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getListaIngrediente() {
        return listaIngrediente;
    }

    public void setListaIngrediente(String listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }
}

