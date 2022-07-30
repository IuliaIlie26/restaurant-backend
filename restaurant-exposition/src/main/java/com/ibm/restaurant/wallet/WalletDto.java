package com.ibm.restaurant.wallet;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.restaurant.domain.Client;

public class WalletDto {

    @JsonProperty
    private int walletId;
    @JsonProperty
    private double balance;
    @JsonProperty
    private Client client;
}
