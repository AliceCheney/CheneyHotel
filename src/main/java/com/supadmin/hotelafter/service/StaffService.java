package com.supadmin.hotelafter.service;

import com.supadmin.hotelafter.entity.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> findStaff();
    int fireStaff(Integer id);
    int upStaff(Integer id,String position);
}
