package com.ibm.restaurant;


import com.ibm.restaurant.application.tables.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class OrdersController {
    @Autowired
    OrderService orderService;
    @PostMapping
    public void createTable(@RequestBody OrdersDto table){

    }
}
