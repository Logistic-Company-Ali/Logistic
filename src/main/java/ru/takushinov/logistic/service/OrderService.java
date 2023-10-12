package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.Order;
import ru.takushinov.logistic.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).get();
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
