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
import ru.takushinov.logistic.dto.ClientDto;
import ru.takushinov.logistic.dto.DriverDto;
import ru.takushinov.logistic.mapper.DriverMapper;
import ru.takushinov.logistic.service.DriverService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drivers")
@RequiredArgsConstructor
public class DriverController {
    private final DriverService driverService;
    private final DriverMapper driverMapper;
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping()
    public List<DriverDto> getAll() {
        return driverMapper.entityToDto(driverService.getAll());
    }
    @PreAuthorize("hasAuthority('ROLE_OPER') or hasAuthority('ROLE_ADMIN')")
    @GetMapping("/{id}")
    public DriverDto getDriverById(@PathVariable Long id) {
        return driverMapper.entityToDto(driverService.getDriverById(id));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public DriverDto save(@RequestBody DriverDto DriverDto) {
        return driverMapper.entityToDto(driverService.save(driverMapper.dtoToEntity(DriverDto)));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @DeleteMapping
    public void delete(@RequestBody DriverDto driverDto) {
        driverService.delete(driverMapper.dtoToEntity(driverDto));
    }
}