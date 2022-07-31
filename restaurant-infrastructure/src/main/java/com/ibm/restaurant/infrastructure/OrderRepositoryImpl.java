package com.ibm.restaurant.infrastructure;

import com.ibm.restaurant.domain.IOrderRepository;
import com.ibm.restaurant.domain.Orders;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class OrderRepositoryImpl implements IOrderRepository {

    private Set<Orders> dbSet=new HashSet<>();
    @Override
    public void createOrder(Orders orders) {
        dbSet.add(orders);
        for(Orders orders1:dbSet){
            System.out.println("Order: "+orders1.toString());
        }
    }

    @Override
    public Orders getOrdersByOrderTable(String orderTable) {
        List<Orders> orders=new ArrayList<>(dbSet);
        for(Orders orders1:orders){
            if(orderTable.equals(orders.getOrderTable())){
                return orders;
            }
        }
        return null;
    }

    @Override
    public Orders getOrderByOrderList(String OrderList) {
        List<Orders> orders=new ArrayList<>(dbSet);
        for(Orders orders1:orders){
            if(orderList.equals(orders.getOrderList())){
                return orders;
            }
        }
        return null;
    }

}
