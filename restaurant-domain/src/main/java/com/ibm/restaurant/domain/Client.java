package com.ibm.restaurant.domain;

import java.util.Objects;

public class Client {
    private Long id;
    private String name;
    private String last_name;
    private String nr_tel;
    private String email;
    private List<cupoane>;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;
        Client client = (Client) c;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", nr_tel='" + nr_tel + '\'' +
                ", email='" + email +
                '}';
    }

}
