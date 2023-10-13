package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.Driver;
import ru.takushinov.logistic.entitie.TransportCompany;
import ru.takushinov.logistic.exception.ResourceNotFoundException;
import ru.takushinov.logistic.repository.TransportCompanyRepository;

import java.util.List;

@Service
public class TransportCompanyService {
    private final TransportCompanyRepository transportCompanyRepository;
    public TransportCompanyService(TransportCompanyRepository transportCompanyRepository) {
        this.transportCompanyRepository = transportCompanyRepository;
    }
    public List<TransportCompany> getAll() {
        return transportCompanyRepository.findAll();
    }
    public TransportCompany getCompanyById(Long id) {
        return transportCompanyRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Company with id " + id + " not found"));
    }
    public TransportCompany save(TransportCompany transportCompany) {
        return transportCompanyRepository.save(transportCompany);
    }
    public void delete(TransportCompany transportCompany) {
        transportCompanyRepository.delete(transportCompany);
    }
}
