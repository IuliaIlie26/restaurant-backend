package com.ibm.restaurant.exposition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tables")
public class TableController {


    @Autowired
    private TableService tableService;

    @GetMapping
    public ResponseEntity<List<TableDto>> getTables() {
        return ResponseEntity.ok(this.tableService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TableDto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.tableService.findById(id));
    }

    @PostMapping
    public ResponseEntity<String> createTable(@RequestBody TableDto dto) {
       return this.tableService.create(dto);
    }

    @PutMapping
    public ResponseEntity<TableDto> updateTable(@RequestBody TableDto dto) {
        return ResponseEntity.ok(tableService.updateTable(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTable(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.tableService.deleteTable(id));
    }
}
