package ru.takushinov.logistic.services;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repositories.TransportCompanyRepository;

@Service
public class TransportCompanyService {
    private final TransportCompanyRepository transportCompanyRepository;

    public TransportCompanyService(TransportCompanyRepository transportCompanyRepository) {
        this.transportCompanyRepository = transportCompanyRepository;
    }
}
