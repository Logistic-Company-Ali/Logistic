package ru.takushinov.logistic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entities.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {
}
