package com.supadmin.hotelafter.dao;

import com.supadmin.hotelafter.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectUserByUsernameAndPassword(@Param(value = "username") String username ,@Param(value = "password") String password);
    User selectByUsernameAndPassword(@Param(value = "username") String username ,@Param(value = "password") String password);
    int updateUserPassword(@Param(value = "username") String username ,@Param(value = "password") String password);
}
