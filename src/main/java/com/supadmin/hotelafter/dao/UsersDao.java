package com.supadmin.hotelafter.dao;

import com.supadmin.hotelafter.entity.Users;

import java.util.List;

public interface UsersDao {
    List<Users> selectUsers();
    int insertUsers(Users users);
    Users selectUsersByRoomids(Integer id);
    int deleteUsersByRoomIds(Integer id);
}
