package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repository.TruckTypeRepository;

@Service
public class TruckTypeService {
    private final TruckTypeRepository truckTypeRepository;

    public TruckTypeService(TruckTypeRepository truckTypeRepository) {
        this.truckTypeRepository = truckTypeRepository;
    }
}
