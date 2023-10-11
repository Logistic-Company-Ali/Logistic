package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.takushinov.logistic.dto.TruckDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.Truck;
import ru.takushinov.logistic.entitie.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TruckMapper {
    @Mapping(target = "transportCompany", ignore = true)
    @Mapping(target = "truckType", ignore = true)
    @Mapping(target = "orders", ignore = true)
    @Mapping(target = "driver", ignore = true)
    Truck dtoToEntity(TruckDto truckDto);
    @Mapping(target = "transportCompany", ignore = true)
    @Mapping(target = "truckType", ignore = true)
    @Mapping(target = "orders", ignore = true)
    @Mapping(target = "driver", ignore = true)
    TruckDto entityToDto(Truck truck);
    List<Truck> dtoToEntity(List<TruckDto> truckDtos);
    List<TruckDto> entityToDto(List<Truck> trucks);
}
