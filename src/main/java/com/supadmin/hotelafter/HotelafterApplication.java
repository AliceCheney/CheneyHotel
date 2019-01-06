package com.supadmin.hotelafter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.supadmin.hotelafter.dao"})
public class HotelafterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelafterApplication.class, args);
	}
}

