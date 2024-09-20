package com.upoint.model.salesroom;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.upoint.model.room.Room;

@Document
public class SalesRoom extends Room {
	
	@Id
	private Long id;
	

	
	
}
