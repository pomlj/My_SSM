package com.kangzhan.services;

import com.kangzhan.dao.UserMapper;
import com.kangzhan.entiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }
}
