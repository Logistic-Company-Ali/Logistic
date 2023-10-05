package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import ru.takushinov.logistic.dto.ClientDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.Client;
import ru.takushinov.logistic.entitie.User;

import java.util.List;
@Mapper
public interface ClientMapper {
    Client dtoToEntity(ClientDto clientDto);
    ClientDto entityToDto(Client client);
    List<Client> dtoToEntity(List<ClientDto> clientDtos);
    List<ClientDto> entityToDto(List<Client> clients);
}
