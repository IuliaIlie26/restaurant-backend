package com.ibm.restaurant.domain;

import java.util.Objects;

public class Menu {

    private String menuID;
    private String menuName;
    private String menuDescription;

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuID, menu.menuID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuID);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuID='" + menuID + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuDescription='" + menuDescription + '\'' +
                '}';
    }
}
