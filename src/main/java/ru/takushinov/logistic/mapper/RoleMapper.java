package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import ru.takushinov.logistic.dto.OrderDto;
import ru.takushinov.logistic.dto.RoleDto;
import ru.takushinov.logistic.entitie.Order;
import ru.takushinov.logistic.entitie.Role;

import java.util.List;

@Mapper
public interface RoleMapper {
    Role dtoToEntity(RoleDto roleDto);
    RoleDto entityToDto(Role role);
    List<Role> dtoToEntity(List<RoleDto> roleDtos);
    List<RoleDto> entityToDto(List<Role> roles);
}
