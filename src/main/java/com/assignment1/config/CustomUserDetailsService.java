package com.assignment1.config;

import com.assignment1.entities.User;
import com.assignment1.service.UserService;
import com.assignment1.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user=userService.getUserByEmail(email);
        if(user==null)
            throw new UsernameNotFoundException("Could not find User");
        CustomUserDetails customUserDetails =new CustomUserDetails(user);
        return customUserDetails;
    }
}
