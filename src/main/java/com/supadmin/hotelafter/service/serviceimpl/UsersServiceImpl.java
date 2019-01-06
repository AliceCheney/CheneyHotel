package com.supadmin.hotelafter.service.serviceimpl;

import com.supadmin.hotelafter.dao.UsersDao;
import com.supadmin.hotelafter.entity.Users;
import com.supadmin.hotelafter.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersDao usersDao;

    @Override
    public List<Users> findUsers(){
        return usersDao.selectUsers();
    }

    @Override
    public int insertUsers(Users users) {
        return usersDao.insertUsers(users);
    }

    @Override
    public Users findUsersByRoomids(Integer id) {
        return usersDao.selectUsersByRoomids(id);
    }

    @Override
    public int deleteUsersByRoomIds(Integer id) {
        return usersDao.deleteUsersByRoomIds(id);
    }

}
