package com.ibm.restaurant;

import com.ibm.restaurant.domain.Table;
import org.springframework.stereotype.Service;

@Service
public class TableMapperService {

    public Table mapToDomain(TableDto dto){

        Table table=new Table();
        table.setStatus(dto.status);
        return table;
    }
}
