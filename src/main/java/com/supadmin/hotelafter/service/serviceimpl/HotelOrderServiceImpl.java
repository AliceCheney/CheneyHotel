package com.supadmin.hotelafter.service.serviceimpl;

import com.supadmin.hotelafter.dao.HotelOrderDao;
import com.supadmin.hotelafter.entity.HotelOrder;
import com.supadmin.hotelafter.service.HotelOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotelOrderServiceImpl implements HotelOrderService {

    @Resource
    HotelOrderDao hotelOrderDao;


    @Override
    public List<HotelOrder> findHotelOrder() {
        return hotelOrderDao.selectHotelOrder();
    }

    @Override
    public HotelOrder findHotelOrderById(Integer id) {
        return hotelOrderDao.selectHotelOrderById(id);
    }

    @Override
    public int addHotelOrderByHotelOrder(HotelOrder hotelOrder) {
        return hotelOrderDao.insertOrderByHotelOrder(hotelOrder);
    }
}
