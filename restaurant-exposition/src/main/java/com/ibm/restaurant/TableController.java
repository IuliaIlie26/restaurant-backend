package com.ibm.restaurant;

import com.ibm.restaurant.application.tables.TableService;
import com.ibm.restaurant.domain.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/table")
public class TableController {

    @Autowired
    private TableService tableService;
    @Autowired
    private TableMapperService tableMapperService;

    @PostMapping
    public ResponseEntity<Void> createTable(@RequestBody TableDto dto) {
        Table table=tableMapperService.mapToDomain(dto);
        tableService.create(table);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
