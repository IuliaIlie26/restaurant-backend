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
}
