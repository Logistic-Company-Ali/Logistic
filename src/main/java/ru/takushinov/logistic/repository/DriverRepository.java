package ru.takushinov.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entitie.Driver;

@Repository
public interface DriverRepository  extends JpaRepository<Driver, Long> {
}
