package ru.takushinov.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entitie.Client;

import java.util.Optional;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {
      Optional<Client> findClientById(Long id);
}
