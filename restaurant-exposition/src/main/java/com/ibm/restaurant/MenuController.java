package com.ibm.restaurant;

import com.ibm.restaurant.application.tables.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @PostMapping
    public void createMenu(@RequestBody MenuDto menu){

    }
}
