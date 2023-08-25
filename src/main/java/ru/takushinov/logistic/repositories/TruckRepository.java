package ru.takushinov.logistic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entities.Truck;
@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
