package com.ibm.restaurant;

import com.ibm.restaurant.domain.Orders;
import org.springframework.stereotype.Service;

@Service
public class OrdersMapperService {

    public Orders mapToDomain(OrdersDto dto){

        return new Orders();
    }

    public OrdersDto mapFromDomain(Orders orders){
        OrdersDto dto=new OrdersDto();
        dto.orderID=orders.getOrderId();
        dto.orderTable=orders.getOrderTable();
        dto.orderTime=orders.getOrderTime();
        dto.OrderList=orders.getOrderList();
        return dto;
    }
}
