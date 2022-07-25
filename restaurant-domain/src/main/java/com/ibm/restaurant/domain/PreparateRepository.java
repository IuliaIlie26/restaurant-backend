package com.ibm.restaurant.domain;

public interface PreparateRepository {

    void createPreparate(Preparate preparate);

    Preparate getPreparateleById(int id);
}
