package com.supadmin.hotelafter;

import com.supadmin.hotelafter.service.RoomService;
import com.supadmin.hotelafter.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelafterApplicationTests {

	@Resource
	RoomService roomService;

	@Resource
	UsersService usersService;

	@Test
	public void contextLoads() {
		System.err.println(usersService.findUsersByRoomids(1022).getUsersname());
	}

}

