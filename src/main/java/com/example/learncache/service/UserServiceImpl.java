package com.example.learncache.service;

import com.example.learncache.dto.UserDto;
import com.example.learncache.entity.UserEntity;
import com.example.learncache.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    @Cacheable(value = "users")
    public UserEntity getAll(Long id) {
        log.info("getting user by id: {}", id);
        return userRepo.findById(id).get();
    }

    @Override
    public UserEntity saveData(UserDto userDto) {
        var item = new UserEntity();
        item.setName(userDto.getName());
        item.setPhone(userDto.getPhone());
        return userRepo.save(item);
    }

    @Override
    @Cacheable(value = "users_cache",key = "#userName")
    public UserEntity saveData(String userName, String phone) {
        log.info("save to data username: {}, phone: {}", userName,phone);
        return userRepo.save(new UserEntity(userName,phone));
    }


}
