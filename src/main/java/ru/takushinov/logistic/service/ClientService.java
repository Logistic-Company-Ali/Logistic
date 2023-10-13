package ru.takushinov.logistic.service;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.Client;
import ru.takushinov.logistic.exception.ResourceNotFoundException;
import ru.takushinov.logistic.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findClientById(id).orElseThrow(()-> new ResourceNotFoundException("Client with id " + id + " not found"));
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }
    public void delete(Client client) {
        clientRepository.delete(client);
    }
}
