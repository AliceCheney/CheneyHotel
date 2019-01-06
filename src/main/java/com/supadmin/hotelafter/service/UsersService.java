package com.supadmin.hotelafter.service;

import com.supadmin.hotelafter.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> findUsers();
    int insertUsers(Users users);
    Users findUsersByRoomids(Integer id);
    int deleteUsersByRoomIds(Integer id);
}
