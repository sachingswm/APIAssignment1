package com.assignment1.service;

import com.assignment1.dao.UserDao;
import com.assignment1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public interface UserService {
    public User getUserByEmail(String email);
    public void saveUser(User user);
}
