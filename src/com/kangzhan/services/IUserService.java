package com.kangzhan.services;

import com.kangzhan.entiy.User;
import org.springframework.web.bind.annotation.RequestParam;

public interface IUserService {


   public User login(String username, String password);

}
