package ru.takushinov.logistic.services;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repositories.TruckTypeRepository;

@Service
public class TruckTypeService {
    private final TruckTypeRepository truckTypeRepository;

    public TruckTypeService(TruckTypeRepository truckTypeRepository) {
        this.truckTypeRepository = truckTypeRepository;
    }
}
