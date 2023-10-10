package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
