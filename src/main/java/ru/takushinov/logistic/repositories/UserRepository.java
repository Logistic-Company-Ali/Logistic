package ru.takushinov.logistic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.takushinov.logistic.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}