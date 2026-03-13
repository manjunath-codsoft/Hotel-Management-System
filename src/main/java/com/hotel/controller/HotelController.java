package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Customer;
import com.hotel.repository.HotelRepo;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelRepo hotelrepo;
	
}
