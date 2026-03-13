package com.hotel.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Room {

	private Integer room_id;
	
	private String room_number;
	
	private String status;
	
}
