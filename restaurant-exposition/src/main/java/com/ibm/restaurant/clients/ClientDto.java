package com.ibm.restaurant.clients;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.restaurant.domain.Adress;
import com.ibm.restaurant.domain.Wallet;

public class ClientDto {

    @JsonProperty
    public Long id;
    @JsonProperty
    public String firstName;
    @JsonProperty
    public String lastName;
    @JsonProperty
    public Adress adress;
    @JsonProperty
    public String phoneNumber;
    @JsonProperty
    public String email;
    @JsonProperty
    public Wallet wallet;
}
