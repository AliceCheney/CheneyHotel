package com.supadmin.hotelafter.service.serviceimpl;

import com.supadmin.hotelafter.dao.UserDao;
import com.supadmin.hotelafter.entity.User;
import com.supadmin.hotelafter.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public boolean login(String username,String password) {
        List<User> users = userDao.selectUserByUsernameAndPassword(username,password);
        return !users.isEmpty();
    }

    @Override
    public String updateUserPassword(String username, String password ,String oldPassword) {
        User user = userDao.selectByUsernameAndPassword(username,oldPassword);
        if (user==null){
            return "old password error";
        }
        if (userDao.updateUserPassword(username,password)==1){
            return "successful";
        }
        return "error";
    }
}
