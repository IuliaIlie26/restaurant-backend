package com.ibm.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/table")
public class TableController {

    @Autowired
    TableService tableService;
    @PostMapping
    public void createTable(@RequestBody TableDto table){

        tableService.create();
    }
}
