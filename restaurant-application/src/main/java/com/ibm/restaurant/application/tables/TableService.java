package com.ibm.restaurant.application.tables;

import com.ibm.restaurant.domain.ITableRepository;
import com.ibm.restaurant.domain.Orders;
import com.ibm.restaurant.domain.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {

    @Autowired
    private ITableRepository iTableRepository;
    public void create(Table table) {

        iTableRepository.createTable(table);
    }

}
