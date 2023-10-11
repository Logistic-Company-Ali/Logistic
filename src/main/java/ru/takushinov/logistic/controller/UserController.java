package ru.takushinov.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.mapper.UserMapper;
import ru.takushinov.logistic.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping()
    public List<UserDto> getAll() {
        return userMapper.entityToDto(userService.getAll());
    }
    @GetMapping("/{username}")
    public UserDto getUserByUsername(@PathVariable String username) {

        return userMapper.entityToDto(userService.getUserByUsername(username));
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public UserDto save(@RequestBody UserDto userDto) {
       return userMapper.entityToDto(userService.save(userMapper.dtoToEntity(userDto)));
    }
}
