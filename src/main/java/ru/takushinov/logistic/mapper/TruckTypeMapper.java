package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import ru.takushinov.logistic.dto.TruckTypeDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.TruckType;
import ru.takushinov.logistic.entitie.User;

import java.util.List;

@Mapper
public interface TruckTypeMapper {
    TruckType dtoToEntity(TruckTypeDto truckTypeDto);
    TruckTypeDto entityToDto(TruckType truckType);
    List<TruckType> dtoToEntity(List<TruckTypeDto> truckTypeDtos);
    List<TruckTypeDto> entityToDto(List<TruckType> truckTypes);
}
