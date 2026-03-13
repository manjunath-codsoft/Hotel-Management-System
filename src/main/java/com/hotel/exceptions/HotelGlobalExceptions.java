package com.hotel.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HotelGlobalExceptions extends RuntimeException {

	String status;
	String message;
	
	public HotelGlobalExceptions(String status, String message){
		super(message);
		this.status = status;
	}
}
