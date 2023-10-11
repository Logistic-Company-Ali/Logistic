package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.takushinov.logistic.dto.TransportCompanyDto;
import ru.takushinov.logistic.entitie.TransportCompany;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransportCompanyMapper {
    @Mapping(target = "trucks", ignore = true)
    TransportCompany dtoToEntity(TransportCompanyDto transportCompanyDtoDto);
    @Mapping(target = "trucks", ignore = true)
    TransportCompanyDto entityToDto(TransportCompany transportCompanyDto);

    List<TransportCompany> dtoToEntity(List<TransportCompanyDto> transportCompanyDtoDtos);

    List<TransportCompanyDto> entityToDto(List<TransportCompany> transportCompanyDtos);
}
