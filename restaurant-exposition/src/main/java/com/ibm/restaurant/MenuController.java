package com.ibm.restaurant;

import com.ibm.restaurant.application.tables.MenuService;
import com.ibm.restaurant.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private MenuMapperService menuMapperService;

    @PostMapping
    public ResponseEntity<Void> createMenu(@RequestBody MenuDto dto){
        Menu menu=menuMapperService.mapToDomain(dto);
        menuService.create(menu);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
