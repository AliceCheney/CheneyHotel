package com.supadmin.hotelafter.dao;

import com.supadmin.hotelafter.entity.Room;

import java.util.List;

public interface RoomDao {
    List<Room> selectRoom();
    int updateStat1(Integer id);
    int updateStat0(Integer id);
    List<Room> selectRoomLikeId(Integer id);
}
