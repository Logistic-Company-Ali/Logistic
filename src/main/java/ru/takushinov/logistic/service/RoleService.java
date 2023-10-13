package ru.takushinov.logistic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.takushinov.logistic.entitie.Role;
import ru.takushinov.logistic.repository.RoleRepository;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;
    public Role getUserRole() {
        return roleRepository.findByRole("ROLE_USER").get();
    }
}
