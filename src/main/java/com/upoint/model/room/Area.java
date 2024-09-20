package com.upoint.model.room;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Area {
	
<<<<<<< HEAD
	@Id
	private Long id;
	
=======
	
	@Id
	private Long id;
	
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	private List<Stand> stands;
	

}
