package com.springboot.taku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.taku.dao.UserDao;
import com.springboot.taku.user.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void saveUser(User user) {
        userDao.save(user);
    }
}
