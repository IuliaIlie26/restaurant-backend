package com.ibm.restaurant.tables;

import com.ibm.restaurant.domain.Table;
import org.springframework.stereotype.Service;

@Service
public class TableMapperService {

    public Table mapToDomain(TableDto dto) {
        Table table = new Table(1L, dto.capacity);
        table.setStatus(dto.status);
        return table;
    }

    public TableDto mapFromDomain(Table table){
        TableDto dto = new TableDto();
        dto.capacity = table.getCapacity();
        dto.status = table.getStatus();
        return dto;
    }
}
