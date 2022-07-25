package com.ibm.restaurant.domain;

import java.util.Objects;

public class Table {

    private Long id;
    private String capacity;
    private String status;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public String getCapacity() {
        return capacity;
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
        return Objects.equals(id, table.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", capacity='" + capacity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
