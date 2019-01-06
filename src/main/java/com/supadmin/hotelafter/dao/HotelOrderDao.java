package com.supadmin.hotelafter.dao;

import com.supadmin.hotelafter.entity.HotelOrder;

import java.util.List;

public interface HotelOrderDao {
    List<HotelOrder> selectHotelOrder();
    HotelOrder selectHotelOrderById(Integer hotelOrderId);
    int insertOrderByHotelOrder(HotelOrder hotelOrder);
}
