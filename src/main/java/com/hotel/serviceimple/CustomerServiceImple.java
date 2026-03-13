package com.hotel.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Customer;
import com.hotel.repository.CustomerRepo;
import com.hotel.service.CustomerService;

@Service
public class CustomerServiceImple implements CustomerService {

	@Autowired
	private CustomerRepo cusRepo;

	@Override
	public Customer saveCustomer(Customer customer) {
		Customer cust = cusRepo.save(customer);
		return cust;
	}
}
