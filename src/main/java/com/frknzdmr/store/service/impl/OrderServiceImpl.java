package com.frknzdmr.store.service.impl;

import com.frknzdmr.store.model.Order;
import com.frknzdmr.store.repository.OrderRepository;
import com.frknzdmr.store.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteOrderById(int id) {
        orderRepository.deleteById(id);
    }

}
