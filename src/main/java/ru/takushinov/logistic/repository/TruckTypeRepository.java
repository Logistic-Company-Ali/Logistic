package ru.takushinov.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entitie.TruckType;
import ru.takushinov.logistic.entitie.User;

import java.util.Optional;

@Repository
public interface TruckTypeRepository extends JpaRepository<TruckType, Long> {
    Optional<TruckType> findByTruckType(String username);
}
