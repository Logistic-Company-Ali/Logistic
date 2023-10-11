package ru.takushinov.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.takushinov.logistic.dto.TransportCompanyDto;
import ru.takushinov.logistic.mapper.TransportCompanyMapper;
import ru.takushinov.logistic.service.TransportCompanyService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transportcompanys")
@RequiredArgsConstructor
public class TransportCompanyController {
    private final TransportCompanyService transportCompanyService;
    private final TransportCompanyMapper transportCompanyMapper;

    @GetMapping()
    public List<TransportCompanyDto> getAll() {
        return transportCompanyMapper.entityToDto(transportCompanyService.getAll());
    }
    @GetMapping("/{id}")
    public TransportCompanyDto getCompanyByName(@PathVariable long id) {

        return transportCompanyMapper.entityToDto(transportCompanyService.getCompanyById(id));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public TransportCompanyDto save(@RequestBody TransportCompanyDto transportCompanyDto) {
        return transportCompanyMapper.entityToDto(transportCompanyService.save(transportCompanyMapper.dtoToEntity(transportCompanyDto)));
    }
}
