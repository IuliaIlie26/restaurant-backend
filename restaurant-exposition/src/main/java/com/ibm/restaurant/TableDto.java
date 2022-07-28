package com.ibm.restaurant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TableDto {

    @JsonProperty
    public String tableID;
    @JsonProperty
    public String capacity;
    @JsonProperty
    public String status;
}
