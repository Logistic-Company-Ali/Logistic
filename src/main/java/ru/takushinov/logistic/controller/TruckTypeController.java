package ru.takushinov.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping()
    public List<TruckTypeDto> getAllTruckTypes() {
        return truckTypeMapper.entityToDto(truckTypeService.getAll());
    }
    @GetMapping("/{truckTypeName}")
    public TruckTypeDto getTruckTypeByName(@PathVariable String truckTypeName) {

        return truckTypeMapper.entityToDto(truckTypeService.getTruckTypeByName(truckTypeName));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public TruckTypeDto saveTruckType(@RequestBody TruckTypeDto truckTypeDto) {
        return truckTypeMapper.entityToDto(truckTypeService.save(truckTypeMapper.dtoToEntity(truckTypeDto)));
    }
}
