package ru.takushinov.logistic.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.takushinov.logistic.dto.TruckDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.Truck;
import ru.takushinov.logistic.entitie.User;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TransportCompanyMapper.class, TruckTypeMapper.class/*, OrderMapper.class, DriverMapper.class*/})
public interface TruckMapper {
    Truck dtoToEntity(TruckDto truckDto);
    TruckDto entityToDto(Truck truck);
    List<Truck> dtoToEntity(List<TruckDto> truckDtos);
    List<TruckDto> entityToDto(List<Truck> trucks);
}
