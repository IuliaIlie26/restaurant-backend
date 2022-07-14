package com.ibm.restaurant.exposition;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class TableService {

    private static HashSet<TableDto> repo = new HashSet<>();

    public ResponseEntity<String> create(TableDto table) {
        long tableId = repo.size() + 1;
        table.tableId = tableId;
        boolean added = repo.add(table);
        if (added) {
            return ResponseEntity.ok("New table added successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(String.format("Table with id %s already exists", table.tableId));
    }

    public List<TableDto> findAll() {
        return new ArrayList<>(repo);
    }

    public TableDto findById(Long id) {
        return repo.stream().filter(dto -> dto.tableId.equals(id)).findFirst().orElseThrow(() ->
                new RuntimeException("Table not found"));
    }

    public TableDto updateTable(TableDto table) {
        TableDto tableFromDB = findById(table.tableId);
        if (tableFromDB != null) {
            tableFromDB.status = (table.status);
            tableFromDB.capacity = (table.capacity);
            deleteTable(table.tableId);
            repo.add(tableFromDB);
            return tableFromDB;
        }
        throw new RuntimeException("Table not found");
    }

    public String deleteTable(Long id) {
        TableDto dto = findById(id);
        boolean removed = repo.remove(dto);
        if (removed) {
            return "Table was deleted";
        }
        throw new RuntimeException("Table not found");
    }
}
