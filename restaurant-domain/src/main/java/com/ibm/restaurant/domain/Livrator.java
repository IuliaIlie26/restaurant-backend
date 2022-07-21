package com.ibm.restaurant.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Livrator
{
    private int ID;
    //@Autowired
    private Const Status_Disponibilitate;

    @Autowired
    private Livr Nume;
    private String Numar_de_Telefon;
    private String[] Lista_Comenzi;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Livr getNume() {
        return Nume;
    }

    public void setNume(Livr nume) {
        Nume = nume;
    }

    public String getNumar_de_Telefon() {
        return Numar_de_Telefon;
    }

    public void setNumar_de_Telefon(String numar_de_Telefon) {
        Numar_de_Telefon = numar_de_Telefon;
    }

    public String[] getLista_Comenzi() {
        return Lista_Comenzi;
    }

    public void setLista_Comenzi(String[] lista_Comenzi) {
        Lista_Comenzi = lista_Comenzi;
    }

    public Const getStatus_Disponibilitate() {
        return Status_Disponibilitate;
    }

    public void setStatus_Disponibilitate(Const status_Disponibilitate) {
        Status_Disponibilitate = status_Disponibilitate;
    }
}