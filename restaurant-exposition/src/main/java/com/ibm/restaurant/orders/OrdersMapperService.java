package com.ibm.restaurant.orders;

import com.ibm.restaurant.domain.Orders;
import org.springframework.stereotype.Service;

@Service
public class OrdersMapperService {

    public Orders mapOrderToDomain(OrdersDTO ordersDTO){
        Orders orders = new Orders(1L, ordersDTO.orderList);
        orders.setOrderStatus(ordersDTO.orderStatus);
        return orders;
    }

    public OrdersDTO mapOrdersFromDomain(Orders orders){
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.orderClient = orders.getOrderClient();
        ordersDTO.orderList = orders.getOrderList();
        ordersDTO.orderTime = orders.getOrderTime();
        ordersDTO.orderStatus = orders.getOrderStatus();
        return ordersDTO;
    }
}
