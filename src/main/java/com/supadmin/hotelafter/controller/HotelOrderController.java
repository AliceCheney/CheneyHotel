package com.supadmin.hotelafter.controller;

import com.supadmin.hotelafter.entity.HotelOrder;
import com.supadmin.hotelafter.service.HotelOrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hotelorder")
@CrossOrigin(origins = "*",maxAge = 3600)
public class HotelOrderController {

    @Resource
    HotelOrderService hotelOrderService;

    @RequestMapping("/getallhotelorder")
    public List<HotelOrder> getAllHotelOrder(){
        return hotelOrderService.findHotelOrder();
    }

    @RequestMapping("/gethotelorderbyid")
    public HotelOrder getHotelOrderById(@RequestParam(value = "id")
                                        Integer id){
        return hotelOrderService.findHotelOrderById(id);
    }

    @RequestMapping("/addorder")
    public String addOrder(HotelOrder hotelOrder){
        if (hotelOrderService.addHotelOrderByHotelOrder(hotelOrder)==1){
            return "successful";
        }else {
            return "error";
        }
    }
}
