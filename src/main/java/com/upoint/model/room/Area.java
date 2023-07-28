package com.upoint.model.room;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Area {
	
	@Id
	private Long id;
	
	private List<Stand> stands;
	

}
