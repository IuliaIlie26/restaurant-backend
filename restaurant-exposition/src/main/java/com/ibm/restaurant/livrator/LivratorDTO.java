package com.ibm.restaurant.livrator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.restaurant.domain.Const;
import com.ibm.restaurant.domain.Livr;
import org.springframework.beans.factory.annotation.Autowired;

public class LivratorDTO
{
    @JsonProperty
    public int ID;
    @JsonProperty
    public Const Status_Disponibilitate;
    @JsonProperty
    public Livr Nume;
    @JsonProperty
    public String Numar_de_Telefon;
    @JsonProperty
    public String[] Lista_Comenzi;
}