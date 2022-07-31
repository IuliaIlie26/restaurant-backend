package com.ibm.restaurant.domain;

import java.util.Objects;

public class Table {

    private String tableID;
    private String capacity;
    private String status;

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return Objects.equals(tableID, table.tableID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableID);
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableID='" + tableID + '\'' +
                ", capacity='" + capacity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}