package ru.takushinov.logistic.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import ru.takushinov.logistic.dto.UserDto;
import ru.takushinov.logistic.entitie.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User dtoToEntity(UserDto userDto);
    UserDto entityToDto(User user);
    List<User> dtoToEntity(List<UserDto> userDtos);
    List<UserDto> entityToDto(List<User> users);
}
