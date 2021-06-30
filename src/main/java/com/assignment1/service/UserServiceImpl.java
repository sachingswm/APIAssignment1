package com.assignment1.service;

import com.assignment1.dao.UserDao;
import com.assignment1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl{

    @Autowired
    private UserDao userDao;


    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }
}
