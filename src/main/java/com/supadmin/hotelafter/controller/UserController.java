package com.supadmin.hotelafter.controller;

import com.supadmin.hotelafter.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam(value = "username")
                                    String username,
                        @RequestParam(value = "password")
                                    String password){
        if(userService.login(username,password)){
            return "successful";
        }else{
            return "error";
        }
    }

    @RequestMapping("/updatepasswrod")
    public String updatePassword(@RequestParam(value = "username")
                                             String username,
                                 @RequestParam(value = "password")
                                             String password,
                                 @RequestParam(value = "oldpassword")
                                             String oldPassword){
        return userService.updateUserPassword(username,password,oldPassword);
    }
}
