package com.supadmin.hotelafter.service.serviceimpl;

import com.supadmin.hotelafter.dao.RoomDao;
import com.supadmin.hotelafter.entity.Room;
import com.supadmin.hotelafter.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Resource
    RoomDao roomDao;

    @Override
    public List<Room> findRoom() {
        return roomDao.selectRoom();
    }

    @Override
    public int updateStat1(Integer id) {
        return roomDao.updateStat1(id);
    }

    @Override
    public int updateStat0(Integer id) {
        return roomDao.updateStat0(id);
    }

    @Override
    public List<Room> findRoomLikeId(Integer id) {
        return roomDao.selectRoomLikeId(id);
    }


}
