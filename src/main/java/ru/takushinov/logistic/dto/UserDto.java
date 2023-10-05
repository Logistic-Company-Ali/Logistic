package ru.takushinov.logistic.dto;


import ru.takushinov.logistic.entitie.Role;

import java.util.Collection;

public class UserDto {
    private Long id;
    private String username;
    private String lastname;
    private String name;
    private String patronymic;
    private String email;
    private Collection<Role> roles;

}
