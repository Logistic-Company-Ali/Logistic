package ru.takushinov.logistic.services;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repositories.TruckRepository;

@Service
public class TruckService {
    private final TruckRepository truckRepository;

    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }
}
