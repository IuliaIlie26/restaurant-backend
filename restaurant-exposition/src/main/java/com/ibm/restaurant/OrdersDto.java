package com.ibm.restaurant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdersDto {
    @JsonProperty
    public String orderID;
    @JsonProperty
    public String orderTable;
    @JsonProperty
    public String orderTime;
    @JsonProperty
    public String OrderList;
}
