package com.ibm.restaurant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuDto {

    @JsonProperty
    public String menuID;
    @JsonProperty
    public String nameMenu;
    @JsonProperty
    public String menuDescription;
}
