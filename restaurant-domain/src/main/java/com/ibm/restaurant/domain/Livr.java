package com.ibm.restaurant.domain;
import org.springframework.stereotype.Component;

@Component
public class Livr
{
    private String Nume;
    private String Prenume;

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }
}