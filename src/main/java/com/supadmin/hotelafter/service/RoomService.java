package com.supadmin.hotelafter.service;

import com.supadmin.hotelafter.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> findRoom();
    int updateStat1(Integer id);
    int updateStat0(Integer id);
    List<Room> findRoomLikeId(Integer id);
}
