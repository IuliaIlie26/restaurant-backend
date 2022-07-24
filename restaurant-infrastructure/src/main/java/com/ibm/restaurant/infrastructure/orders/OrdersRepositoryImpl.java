package com.ibm.restaurant.infrastructure.orders;

import com.ibm.restaurant.domain.IOrdersRepository;
import com.ibm.restaurant.domain.Orders;
import com.ibm.restaurant.domain.Table;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class OrdersRepositoryImpl implements IOrdersRepository {

    private Set<Orders> ordersSet = new HashSet<>();

    @Override
    public void createOrder(Orders orders) {
        ordersSet.add(orders);
        for(Orders orders1: ordersSet){

            System.out.println("Order: "+orders1.toString());
        }

    }

    @Override
    public Orders getOrdersById(Long orderId) {
        List<Orders> orders = new ArrayList<>(ordersSet);
        for(Orders order: orders){
            if(orderId.equals(order.getOrderId())){

                return order;
            }
        }
        return null;
    }
}
