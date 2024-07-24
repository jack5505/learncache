package com.example.learncache.repository;

import com.example.learncache.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<UserEntity,Long> {
}
