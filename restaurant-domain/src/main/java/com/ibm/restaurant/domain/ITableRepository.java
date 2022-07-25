package com.ibm.restaurant.domain;

import java.util.HashSet;

public interface ITableRepository {

    void createTable(Table table);

    Table getTableById(Long id);

    HashSet<Table> getTableList();
}
