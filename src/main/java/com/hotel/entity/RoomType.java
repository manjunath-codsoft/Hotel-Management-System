package com.hotel.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class RoomType {

	private Integer room_type_id;
	
	private String type_name;
	
	private Double price_per_night;
	
	private Integer max_ocuupy;
}
