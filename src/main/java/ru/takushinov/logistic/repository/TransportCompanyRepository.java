package ru.takushinov.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entitie.TransportCompany;

import java.util.Optional;

@Repository
public interface TransportCompanyRepository extends JpaRepository<TransportCompany, Long> {

}
