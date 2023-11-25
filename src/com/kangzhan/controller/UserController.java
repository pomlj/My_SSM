package com.kangzhan.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.kangzhan.entiy.User;
import com.kangzhan.services.IUserService;
import com.kangzhan.services.UserServiceImpl;
import com.kangzhan.utils.Constants;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController{
    private Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private IUserService userService;



    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String doLogin(@RequestParam String userCode, @RequestParam String userPassword, HttpServletRequest request, HttpSession session){
        logger.debug("doLogin====================================");
        //调用service方法，进行用户匹配
        User user = userService.login(userCode,userPassword);
        System.out.println(userService.login(userCode,userPassword));
        if(null != user){//登录成功
            //放入session
            session.setAttribute(Constants.USER_SESSION, user);

            return "frame";

        }else{

            request.setAttribute("error", "用户名或密码不正确");
            return "login";
        }
    }

}
