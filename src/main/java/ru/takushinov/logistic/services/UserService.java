package ru.takushinov.logistic.services;

import org.springframework.stereotype.Service;
import ru.takushinov.logistic.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
