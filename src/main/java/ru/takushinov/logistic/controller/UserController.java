package ru.takushinov.logistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.mapper.UserMapper;
import ru.takushinov.logistic.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    private final UserService userService;
    @Autowired
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping()
    public List<UserDto> getAllUsers() {
        return userMapper.entityToDto(userService.getAllUsers());
    }
    @GetMapping("/{username}")
    public UserDto getUserByUsername(@PathVariable String username) {
        return userMapper.entityToDto(userService.getUserByUsername(username));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public UserDto saveUser(@RequestBody UserDto userDto) {
       return userMapper.entityToDto(userService.save(userMapper.dtoToEntity(userDto)));
    }
}
