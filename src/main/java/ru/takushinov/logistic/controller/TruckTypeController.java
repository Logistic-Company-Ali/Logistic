package ru.takushinov.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.takushinov.logistic.dto.TruckTypeDto;
import ru.takushinov.logistic.mapper.TruckTypeMapper;
import ru.takushinov.logistic.service.TruckTypeService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trucktypes")
@RequiredArgsConstructor
public class TruckTypeController {
    private final TruckTypeService truckTypeService;
    private final TruckTypeMapper truckTypeMapper;
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping()
    public List<TruckTypeDto> getAll() {
        return truckTypeMapper.entityToDto(truckTypeService.getAll());
    }
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping("/{truckTypeName}")
    public TruckTypeDto getTruckTypeByName(@PathVariable String truckTypeName) {
        return truckTypeMapper.entityToDto(truckTypeService.getTruckTypeByName(truckTypeName));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public TruckTypeDto save(@RequestBody TruckTypeDto truckTypeDto) {
        return truckTypeMapper.entityToDto(truckTypeService.save(truckTypeMapper.dtoToEntity(truckTypeDto)));
    }
}
