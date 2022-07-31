package com.ibm.restaurant.application.tables;

import com.ibm.restaurant.domain.IOrderRepository;
import com.ibm.restaurant.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private IOrderRepository iOrderRepository;
    public void create(Orders orders){

        iOrderRepository.createOrder(orders);
    }

    public Orders getOrdersByOrderTable(String OrderTable){
        return iOrderRepository.getOrdersByOrderTable(OrderTable);
    }

    public Orders getOrdersByOrderList(String OrderList){
        return iOrderRepository.getOrdersByOrderList(OrderList);
    }
}
