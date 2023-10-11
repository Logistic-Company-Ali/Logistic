package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.takushinov.logistic.dto.TruckTypeDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.TruckType;
import ru.takushinov.logistic.entitie.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TruckTypeMapper {
    @Mapping(target = "trucks", ignore = true)
    TruckType dtoToEntity(TruckTypeDto truckTypeDto);
    @Mapping(target = "trucks", ignore = true)
    TruckTypeDto entityToDto(TruckType truckType);

    List<TruckType> dtoToEntity(List<TruckTypeDto> truckTypeDtos);

    List<TruckTypeDto> entityToDto(List<TruckType> truckTypes);
}
