package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.Driver;
import ru.takushinov.logistic.entitie.Truck;
import ru.takushinov.logistic.repository.TruckRepository;

import java.util.List;

@Service
public class TruckService {
    private final TruckRepository truckRepository;
    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }
    public List<Truck> getAll() {
        return truckRepository.findAll();
    }
    public Truck getTruckById(Long id) {
        return truckRepository.findById(id).get();
    }
    public Truck save(Truck truck) {
        return truckRepository.save(truck);
    }
    public void delete(Truck truck) {
        truckRepository.delete(truck);
    }
}
