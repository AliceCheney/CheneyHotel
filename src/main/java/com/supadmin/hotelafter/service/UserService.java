package com.supadmin.hotelafter.service;

import com.supadmin.hotelafter.entity.User;

public interface UserService {
    boolean login(String username,String password);
    String updateUserPassword(String username, String password,String oldPassword);
}
