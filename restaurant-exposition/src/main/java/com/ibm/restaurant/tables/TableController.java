package com.ibm.restaurant.tables;

import com.ibm.restaurant.application.tables.TableService;
import com.ibm.restaurant.domain.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/table")
public class TableController {

    @Autowired
    private TableService tableService;
    @Autowired
    private TableMapperService tableMapperService;

    @PostMapping
    public ResponseEntity<Void> createTable(@RequestBody TableDto dto) {
        Table table = tableMapperService.mapToDomain(dto);
        tableService.create(table);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TableDto> getTableById(@PathVariable Long id){

       Table table = tableService.getTableById(id);
       TableDto dto = tableMapperService.mapFromDomain(table);
       return ResponseEntity.status(HttpStatus.OK).body(dto);

    }


}
