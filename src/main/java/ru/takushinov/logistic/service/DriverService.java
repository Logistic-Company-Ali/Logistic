package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repository.DriverRepository;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }


}
