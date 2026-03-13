package com.hotel.exceptions;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerGlobalExceptions{

	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ErrorInfoDto handleException(Exception e) {
		ErrorInfoDto et = new ErrorInfoDto();
		et.setErrorCode("");
		et.setMessage(e.getMessage());
		et.setDate(LocalDateTime.now());
		return et;
	}
	
	
}
