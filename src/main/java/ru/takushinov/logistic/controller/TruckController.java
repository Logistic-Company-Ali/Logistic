package ru.takushinov.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.takushinov.logistic.dto.TransportCompanyDto;
import ru.takushinov.logistic.dto.TruckDto;
import ru.takushinov.logistic.mapper.TruckMapper;
import ru.takushinov.logistic.service.TruckService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trucks")
@RequiredArgsConstructor
public class TruckController {
    private final TruckService truckService;
    private final TruckMapper truckMapper;
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping()
    public List<TruckDto> getAll() {
        return truckMapper.entityToDto(truckService.getAll());
    }
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping("/{id}")
    public TruckDto getTruckByName(@PathVariable Long id) {
        return truckMapper.entityToDto(truckService.getTruckById(id));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public TruckDto save(@RequestBody TruckDto truckDto) {
        return truckMapper.entityToDto(truckService.save(truckMapper.dtoToEntity(truckDto)));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @DeleteMapping
    public void delete(@RequestBody TruckDto truckDto) {
        truckService.delete(truckMapper.dtoToEntity(truckDto));
    }
}
