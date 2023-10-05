package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import ru.takushinov.logistic.dto.TransportCompanyDto;
import ru.takushinov.logistic.entitie.TransportCompany;

import java.util.List;

@Mapper
public interface TransportCompanyMapper {
    TransportCompany dtoToEntity(TransportCompanyDto transportCompanyDtoDto);
    TransportCompanyDto entityToDto(TransportCompany transportCompanyDto);
    List<TransportCompany> dtoToEntity(List<TransportCompanyDto> transportCompanyDtoDtos);
    List<TransportCompanyDto> entityToDto(List<TransportCompany> transportCompanyDtos);
}
