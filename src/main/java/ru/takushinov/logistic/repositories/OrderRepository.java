package ru.takushinov.logistic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entities.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
