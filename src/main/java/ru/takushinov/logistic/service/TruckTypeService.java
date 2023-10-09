package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.TruckType;
import ru.takushinov.logistic.repository.TruckTypeRepository;

import java.util.List;

@Service
public class TruckTypeService {
    private final TruckTypeRepository truckTypeRepository;

    public TruckTypeService(TruckTypeRepository truckTypeRepository) {
        this.truckTypeRepository = truckTypeRepository;
    }

    public List<TruckType> getAllTruckTypes() {
        return truckTypeRepository.findAll();
    }

    public TruckType getTruckTypeByName(String truckTypeName) {
        return truckTypeRepository.findByType(truckTypeName).get();
    }

    public TruckType save(TruckType truckType) {
        return truckTypeRepository.save(truckType);
    }
}
