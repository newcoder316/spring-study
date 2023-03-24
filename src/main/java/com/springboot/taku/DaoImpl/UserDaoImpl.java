package com.springboot.taku.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.taku.dao.UserDao;
import com.springboot.taku.user.User;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(User user) {
        String sql = "INSERT INTO userinfo(username, password) VALUES(?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword());
    }
}
