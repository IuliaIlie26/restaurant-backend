package com.ibm.restaurant;

import com.ibm.restaurant.application.tables.OrderService;
import com.ibm.restaurant.domain.Orders;
import jdk.nashorn.internal.objects.AccessorPropertyDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/orders")
public class OrdersController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrdersMapperService ordersMapperService;

    @PostMapping
    public ResponseEntity<Void> createOrders(@RequestBody OrdersDto dto){
        Orders orders=ordersMapperService.mapToDomain(dto);
        orderService.create(orders);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{orderTable}")
    public ResponseEntity<OrdersDto>getOrderByOrderTable(@PathVariable String orderTable){
        Orders orders=orderService.getOrdersByOrderTable(orderTable);
        OrdersDto dto=ordersMapperService.mapFromDomain(orders);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @GetMapping("/{orderList}")
    public ResponseEntity<OrdersDto>getOrderByOrderList(@PathVariable String orderList){
        Orders orders=orderService.getOrdersByOrderList(orderList);
        OrdersDto dto=ordersMapperService.mapFromDomain(orders);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
}
