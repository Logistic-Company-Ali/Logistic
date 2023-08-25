package ru.takushinov.logistic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entities.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
