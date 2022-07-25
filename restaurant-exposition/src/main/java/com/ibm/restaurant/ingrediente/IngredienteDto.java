package com.ibm.restaurant.ingrediente;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredienteDto {

    @JsonProperty
    private String nume;

    @JsonProperty
    private String data;

    @JsonProperty
    private String listaPreparat;
}
