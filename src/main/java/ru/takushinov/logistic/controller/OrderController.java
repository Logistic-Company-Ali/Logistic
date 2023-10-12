package ru.takushinov.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.takushinov.logistic.dto.OrderDto;
import ru.takushinov.logistic.mapper.OrderMapper;
import ru.takushinov.logistic.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final OrderMapper orderMapper;
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping()
    public List<OrderDto> getAll() {
        return orderMapper.entityToDto(orderService.getAll());
    }
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping("/{id}")
    public OrderDto getOrderByName(@PathVariable Long id) {
        return orderMapper.entityToDto(orderService.getOrderById(id));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public OrderDto save(@RequestBody OrderDto orderDto) {
        return orderMapper.entityToDto(orderService.save(orderMapper.dtoToEntity(orderDto)));
    }
}