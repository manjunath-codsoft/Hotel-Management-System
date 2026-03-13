package com.hotel.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Integer customer_id;
	
	private String customer_name;
	
	private String phone;
	
	private String email;
}
