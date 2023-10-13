package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import ru.takushinov.logistic.dto.DriverDto;
import ru.takushinov.logistic.dto.OrderDto;
import ru.takushinov.logistic.entitie.Driver;
import ru.takushinov.logistic.entitie.Order;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TruckMapper.class, ClientMapper.class})
public interface OrderMapper {
    Order dtoToEntity(OrderDto orderDto);
    OrderDto entityToDto(Order order);
    List<Order> dtoToEntity(List<OrderDto> orderDtos);
    List<OrderDto> entityToDto(List<Order> orders);
}
