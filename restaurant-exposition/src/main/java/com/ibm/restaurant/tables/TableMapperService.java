package com.ibm.restaurant.tables;

import com.ibm.restaurant.domain.Table;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class TableMapperService {

    public Table mapToDomain(TableDto dto) {
        Table table = new Table();
        table.setStatus(dto.status);
        table.setCapacity(dto.capacity);
        return table;
    }

    public TableDto mapFromDomain(Table table){
        TableDto dto = new TableDto();
        dto.capacity = table.getCapacity();
        dto.status = table.getStatus();
        dto.id = table.getId();
        return dto;
    }

    public HashSet<TableDto> mapFromDomain(HashSet<Table> tableList)
    {
        HashSet <TableDto> listAux = new HashSet<>();
        for(Table table : tableList)
        {
          listAux.add(mapFromDomain(table));

        }
        return listAux;
    }

}
