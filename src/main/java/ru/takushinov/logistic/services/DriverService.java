package ru.takushinov.logistic.services;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repositories.DriverRepository;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
}
