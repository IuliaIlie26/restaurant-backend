package com.ibm.restaurant.preparate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PreparateDto {

    @JsonProperty
    private String nume;

    @JsonProperty
    private String descriere;

    @JsonProperty
    private double pret;

    @JsonProperty
    private String listaIngrediente;
}
