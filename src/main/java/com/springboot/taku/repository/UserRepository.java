package com.springboot.taku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.taku.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
