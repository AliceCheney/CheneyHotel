package com.supadmin.hotelafter.controller;

import com.supadmin.hotelafter.entity.Room;
import com.supadmin.hotelafter.service.RoomService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 *
 * room web controller
 *
 */
@RestController
@RequestMapping("/room")
@CrossOrigin(origins = "*",maxAge = 3600)
public class RoomController {

    @Resource
    RoomService roomService;

    @RequestMapping("/getallroom")
    public List<Room> getAllRoom(){
        return roomService.findRoom();
    }

    @RequestMapping("/updatestat1")
    public String updateState1(@RequestParam(value = "id")
                              Integer id){
        if(roomService.updateStat1(id)==1){
            return "successful";
        }else{
            return "error";
        }
    }

    @RequestMapping("/updatestat0")
    public String updateStat0(@RequestParam(value = "id")
                              Integer id){
         if(roomService.updateStat0(id)==1){
             return "successful";
         }else{
             return "error";
         }
    }

    @RequestMapping("/getroomlikeid")
    public List<Room> getRoomLikeId(@RequestParam(value = "id")
                                    Integer id){
        return roomService.findRoomLikeId(id);
    }

}
