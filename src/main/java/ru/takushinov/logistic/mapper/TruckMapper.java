package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import ru.takushinov.logistic.dto.TruckDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.Truck;
import ru.takushinov.logistic.entitie.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TruckMapper {
    Truck dtoToEntity(TruckDto truckDto);
    TruckDto entityToDto(Truck truck);
    List<Truck> dtoToEntity(List<TruckDto> truckDtos);
    List<TruckDto> entityToDto(List<Truck> trucks);
}
