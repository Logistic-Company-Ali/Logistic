package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.takushinov.logistic.dto.DriverDto;
import ru.takushinov.logistic.entitie.Driver;

import java.util.List;

@Mapper(componentModel = "spring", uses = TruckMapper.class)
public interface DriverMapper {
    Driver dtoToEntity(DriverDto driverDto);
    DriverDto entityToDto(Driver driver);
    List<Driver> dtoToEntity(List<DriverDto> driverDtos);
    List<DriverDto> entityToDto(List<Driver> drivers);
}
