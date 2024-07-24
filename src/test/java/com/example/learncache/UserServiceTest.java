package com.example.learncache;

import com.example.learncache.dto.UserDto;
import com.example.learncache.entity.UserEntity;
import com.example.learncache.repository.UserRepo;
import com.example.learncache.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserServiceTest extends LearnCacheApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo userRepo;

    @Test
    void test(){
        UserEntity user = new UserEntity();
        user.setPhone("998937555505");
        user.setName("Sabirov jakhongir");

        userService.saveData(UserDto.builder().phone("+998937555505").name("Sabirov jakhongir").build());
        userService.saveData(UserDto.builder().phone("+998948660000").name("Otabekov Mansur").build());

        userService.getAll(1L);
        userService.getAll(2L);

        UserEntity all = userService.getAll(1L);
        all.setPhone("9989360261800");
        userRepo.save(all);

        userService.getAll(2L);
        userService.getAll(2L);
        userService.getAll(2L);
        userService.getAll(2L);
        userService.getAll(2L);
        userService.getAll(2L);
        UserEntity all1 = userService.getAll(1L);
        System.out.println(all1.getPhone());

    }

    @Test
    void test2(){
        userService.saveData("jack","998937555505");
        UserEntity user = userService.saveData("jack", "998946608811");
        System.out.println(user.getPhone());
    }
}
