package ru.takushinov.logistic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entities.TransportCompany;
@Repository
public interface TransportCompanyRepository extends JpaRepository<TransportCompany, Long> {
}
