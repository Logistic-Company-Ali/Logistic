package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.TransportCompany;
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
        return transportCompanyRepository.findById(id).get();
    }

    public TransportCompany save(TransportCompany transportCompany) {
        return transportCompanyRepository.save(transportCompany);
    }
}
