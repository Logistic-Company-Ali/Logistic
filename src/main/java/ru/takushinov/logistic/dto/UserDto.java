package ru.takushinov.logistic.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.takushinov.logistic.entitie.Role;

import java.util.Collection;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private Long id;
    private String username;
    private String lastname;
    private String name;
    private String patronymic;
    private String email;
    private Collection<Role> roles;

}
