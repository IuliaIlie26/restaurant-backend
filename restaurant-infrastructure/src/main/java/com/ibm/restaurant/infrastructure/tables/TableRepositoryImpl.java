package com.ibm.restaurant.infrastructure.tables;

import com.ibm.restaurant.domain.ITableRepository;
import com.ibm.restaurant.domain.Table;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class TableRepositoryImpl implements ITableRepository {

    private Set<Table> dbSet = new HashSet<>();

    @Override
    public void createTable(Table table) {
        dbSet.add(table);
        for (Table table1 : dbSet) {

            System.out.println("=============== db element: "+ table1.toString());
        }
    }
}
