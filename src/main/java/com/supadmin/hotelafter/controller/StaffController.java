package com.supadmin.hotelafter.controller;

import com.supadmin.hotelafter.entity.Staff;
import com.supadmin.hotelafter.service.StaffService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/staff")
@CrossOrigin(origins = "*",maxAge = 3600)
public class StaffController {

    @Resource
    StaffService staffService;

    @RequestMapping("/getallstaff")
    public List<Staff> getAllStaff(){
        return staffService.findStaff();
    }

    @RequestMapping("/firestaff")
    public String fireStaff(@RequestParam(value = "id")
                            Integer id){
        if (staffService.fireStaff(id)==1){
            return "successful";
        }else {
            return "error";
        }
    }

    @RequestMapping("/upstaff")
    public String upStaff(@RequestParam(value = "id")
                          Integer id,
                          @RequestParam(value = "position")
                          String position){
        if (staffService.upStaff(id,position)==1){
            return "successful";
        }else {
            return "error";
        }
    }
}
