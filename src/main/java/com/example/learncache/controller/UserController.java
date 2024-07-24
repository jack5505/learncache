package com.example.learncache.controller;

import com.example.learncache.dto.UserDto;
import com.example.learncache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public ResponseEntity<?> getAll(@PathVariable Long id){
        return ResponseEntity.ok(userService.getAll(id));
    }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.saveData(userDto));
    }


}
