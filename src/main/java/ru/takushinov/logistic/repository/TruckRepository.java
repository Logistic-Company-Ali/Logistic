package ru.takushinov.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entitie.Truck;
@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
