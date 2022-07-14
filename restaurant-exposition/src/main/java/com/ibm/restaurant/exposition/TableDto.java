package com.ibm.restaurant.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TableDto {

    @JsonProperty
    public Long tableId;

    @JsonProperty
    public Integer capacity;

    @JsonProperty
    public String status;
}
