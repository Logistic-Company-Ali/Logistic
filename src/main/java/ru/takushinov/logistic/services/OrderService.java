package ru.takushinov.logistic.services;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repositories.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
