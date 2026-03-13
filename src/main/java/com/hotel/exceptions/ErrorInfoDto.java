package com.hotel.exceptions;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfoDto {

	private String errorCode;
	private String message;
	private LocalDateTime date;
}
