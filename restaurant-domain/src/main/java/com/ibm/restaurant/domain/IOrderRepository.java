package com.ibm.restaurant.domain;

public interface IOrderRepository {
    void createOrder(Orders orders);

    Orders getOrdersByOrderTable(String OrderTable);

    Orders getOrderByOrderList(String OrderList);
}
