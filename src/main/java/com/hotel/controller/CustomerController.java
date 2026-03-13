package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Customer;
import com.hotel.repository.CustomerRepo;

@RestController
@RequestMapping("/user")
public class CustomerController {

	@Autowired
	private CustomerRepo cusrepo;
	
	@PostMapping("/save")
	public Customer saveCustomer(Customer customer) {
		Customer cust = cusrepo.save(customer);
		return cust;
	}
	
}
