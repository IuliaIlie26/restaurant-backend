package com.ibm.restaurant.clients;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.restaurant.domain.Adress;
import com.ibm.restaurant.domain.Wallet;

public class ClientsDto {

    @JsonProperty
    private String firstName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private Adress adress;
    @JsonProperty
    private String phoneNumber;
    @JsonProperty
    private String email;
    @JsonProperty
    private Wallet wallet;
}
