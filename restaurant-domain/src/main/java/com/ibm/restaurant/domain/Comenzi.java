package com.ibm.restaurant.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Comenzi
{
    private int ID_Comanda;
    private int ID_Livrator;

    //@Autowired
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
}
