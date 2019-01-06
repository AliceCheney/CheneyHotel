package com.supadmin.hotelafter.dao;

import com.supadmin.hotelafter.entity.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffDao {
    List<Staff> selectStaff();
    int updateStaffStat(Integer id);
    int updateStaffPosition(@Param(value = "id") Integer id,@Param(value = "position") String position);
}
