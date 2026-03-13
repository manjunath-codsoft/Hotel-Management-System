package com.hotel.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.HotelService;

@Service
public class HotelServiceImple implements HotelService{

	@Autowired
	private HotelService hotel;
}
