package com.ibm.restaurant.comenzi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.restaurant.domain.Const;

public class ComenziDTO
{
    @JsonProperty
    public int ID_Comanda;
    @JsonProperty
    public int ID_Livrator;
    @JsonProperty
    public Const Status_Livrare;
}