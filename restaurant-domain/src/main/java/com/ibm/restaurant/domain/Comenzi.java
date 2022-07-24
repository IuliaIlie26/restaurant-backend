package com.ibm.restaurant.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;

@Component
public class Comenzi
{
    private int ID_Comanda;
    private int ID_Livrator;

    //@Autowired - Update 24/07/2022 - Nu merge, Enum nu e Bean.
    private Const Status_Livrare;

    public int getID_Comanda() {
        return ID_Comanda;
    }

    public void setID_Comanda(int ID_Comanda) {
        this.ID_Comanda = ID_Comanda;
    }

    public int getID_Livrator() {
        return ID_Livrator;
    }

    public void setID_Livrator(int ID_Livrator) {
        this.ID_Livrator = ID_Livrator;
    }

    public Const getStatus_Livrare() {
        return Status_Livrare;
    }

    public void setStatus_Livrare(Const status_Livrare) {
        Status_Livrare = status_Livrare;
    }

    //Update 24/07/2022 - 17:51;


    @Override
    public int hashCode() {
        return Objects.hash(ID_Comanda,ID_Livrator);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Comenzi comanda1  = (Comenzi) obj;
        return Objects.equals(ID_Comanda, comanda1.ID_Comanda);
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + ID_Comanda +
                ", id Livrator = " + ID_Livrator +
                ", Status : " + Status_Livrare + '\'' + '}';
    }
}
