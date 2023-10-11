package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.takushinov.logistic.dto.ClientDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.Client;
import ru.takushinov.logistic.entitie.User;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mapping(target = "orders", ignore = true)
    Client dtoToEntity(ClientDto clientDto);
    @Mapping(target = "orders", ignore = true)
    ClientDto entityToDto(Client client);

    List<Client> dtoToEntity(List<ClientDto> clientDtos);

    List<ClientDto> entityToDto(List<Client> clients);
}
