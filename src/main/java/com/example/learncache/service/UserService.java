package com.example.learncache.service;

import com.example.learncache.dto.UserDto;
import com.example.learncache.entity.UserEntity;

public interface UserService {
    UserEntity getAll(Long id);

    UserEntity saveData(UserDto userDto);

    UserEntity saveData(String userName,String phone);
}
