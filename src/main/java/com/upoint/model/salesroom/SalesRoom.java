package com.upoint.model.salesroom;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
<<<<<<< HEAD

=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import com.upoint.model.room.Room;

@Document
public class SalesRoom extends Room {
	
	@Id
	private Long id;
	

	
	
}
