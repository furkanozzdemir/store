package com.frknzdmr.store.service;

import com.frknzdmr.store.model.Order;

import java.util.List;

public interface OrderService {

    Order saveOrder(Order order);
    List<Order> getOrders();
    Order getOrderById(int id);
    void deleteOrderById(int id);

}
