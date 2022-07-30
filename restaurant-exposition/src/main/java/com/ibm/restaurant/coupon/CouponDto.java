package com.ibm.restaurant.coupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.restaurant.domain.Client;

public class CouponDto {

    @JsonProperty
    public Client client;

    @JsonProperty
    public double discountValue;

}
