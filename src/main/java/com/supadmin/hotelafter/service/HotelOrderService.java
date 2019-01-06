package com.supadmin.hotelafter.service;

import com.supadmin.hotelafter.entity.HotelOrder;

import java.util.List;

public interface HotelOrderService {
    List<HotelOrder> findHotelOrder();
    HotelOrder findHotelOrderById(Integer id);
    int addHotelOrderByHotelOrder(HotelOrder hotelOrder);
}
