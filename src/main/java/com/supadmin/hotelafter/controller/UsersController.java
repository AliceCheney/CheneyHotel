package com.supadmin.hotelafter.controller;

import com.supadmin.hotelafter.entity.Users;
import com.supadmin.hotelafter.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*",maxAge = 3600)
public class UsersController {

    @Resource
    UsersService usersService;

    @RequestMapping("/getallusers")
    public List<Users> getAllUsers(){
        return usersService.findUsers();
    }

    @RequestMapping("/adduseres")
    public String addUsers(Users users){
        if (usersService.insertUsers(users)==1){
            return "successful";
        }else {
            return "error";
        }
    }

    @RequestMapping("/getusersbyroomids")
    public Users getUsersByRoomIds(@RequestParam(value = "id")
                                   Integer id){
        return usersService.findUsersByRoomids(id);
    }

    @RequestMapping("/delusersbyroomids")
    public String deleteUsersByRoomIds(@RequestParam(value = "id")
                                       Integer id){
        if (usersService.deleteUsersByRoomIds(id)==1){
            return "successful";
        }else {
            return "error";
        }
    }
}
