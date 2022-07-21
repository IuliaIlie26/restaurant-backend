package com.ibm.restaurant.domain;

public interface ITableRepository {

    void createTable(Table table);

    Table getTableById(Long id);
}
