package com.ibm.restaurant.domain;

public class Ingrediente {

    private int id;
    private String nume;
    private String data;
    private String listaPreparat;

    public Ingrediente(int id, String nume, String data, String listaPreparat) {
        this.id = id;
        this.nume = nume;
        this.data = data;
        this.listaPreparat = listaPreparat;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getListaPreparat() {
        return listaPreparat;
    }

    public void setListaPreparat(String listaPreparat) {
        this.listaPreparat = listaPreparat;
    }
}
