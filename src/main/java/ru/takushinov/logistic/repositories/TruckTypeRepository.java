package ru.takushinov.logistic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entities.TruckType;
@Repository
public interface TruckTypeRepository extends JpaRepository<TruckType, Long> {
}
