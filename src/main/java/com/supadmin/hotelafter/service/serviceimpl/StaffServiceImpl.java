package com.supadmin.hotelafter.service.serviceimpl;

import com.supadmin.hotelafter.dao.StaffDao;
import com.supadmin.hotelafter.entity.Staff;
import com.supadmin.hotelafter.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    StaffDao staffDao;

    @Override
    public List<Staff> findStaff(){
        return staffDao.selectStaff();
    }

    @Override
    public int fireStaff(Integer id) {
        return staffDao.updateStaffStat(id);
    }

    @Override
    public int upStaff(Integer id, String position) {
        return staffDao.updateStaffPosition(id,position);
    }
}
