package ru.takushinov.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.takushinov.logistic.dto.ClientDto;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.mapper.ClientMapper;
import ru.takushinov.logistic.mapper.UserMapper;
import ru.takushinov.logistic.service.ClientService;
import ru.takushinov.logistic.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @GetMapping()
    public List<ClientDto> getAll() {
        return clientMapper.entityToDto(clientService.getAll());
    }
    @GetMapping("/{id}")
    public ClientDto getClientById(@PathVariable Long id) {

        return clientMapper.entityToDto(clientService.getClientById(id));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public ClientDto save(@RequestBody ClientDto ClientDto) {
        return clientMapper.entityToDto(clientService.save(clientMapper.dtoToEntity(ClientDto)));
    }
}