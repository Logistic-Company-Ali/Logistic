package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.Client;
import ru.takushinov.logistic.entitie.Driver;
import ru.takushinov.logistic.exception.ResourceNotFoundException;
import ru.takushinov.logistic.repository.DriverRepository;

import java.util.List;

@Service
public class DriverService {
    private final DriverRepository driverRepository;
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
    public List<Driver> getAll() {
        return driverRepository.findAll();
    }
    public Driver getDriverById(Long id) {
        return driverRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Driver with id " + id + " not found"));
    }
    public Driver save(Driver driver) {
        return driverRepository.save(driver);
    }
    public void delete(Driver driver) {
        driverRepository.delete(driver);
    }
}
