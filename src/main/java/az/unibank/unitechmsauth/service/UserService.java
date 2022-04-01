package az.unibank.unitechmsauth.service;

import az.unibank.unitechmsauth.dao.entity.UserEntity;
import az.unibank.unitechmsauth.model.UserCreateDto;
import az.unibank.unitechmsauth.model.response.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto saveUser(UserCreateDto userCreateDto);

    UserResponseDto getUser(String username);

    List<UserResponseDto> getUsers();
}
