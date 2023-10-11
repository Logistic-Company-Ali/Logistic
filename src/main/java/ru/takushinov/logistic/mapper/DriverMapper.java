package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.takushinov.logistic.dto.DriverDto;
import ru.takushinov.logistic.entitie.Driver;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    @Mapping(target = "truck", ignore = true)
    Driver dtoToEntity(DriverDto driverDto);
    @Mapping(target = "truck", ignore = true)
    DriverDto entityToDto(Driver driver);
    List<Driver> dtoToEntity(List<DriverDto> driverDtos);
    List<DriverDto> entityToDto(List<Driver> drivers);
}
