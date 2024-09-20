package com.upoint.model.room;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.upoint.model.util.StandType;

<<<<<<< HEAD
@Document
public class Stand {
	
=======

@Document
public class Stand {

>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@Id
	private Long id;
	
	
	private String label;
	
	
	private StandType type;
	
	
	private Integer maxColumn;
	
	
	private Integer maxRow;
	
	
	private List<Section> sections;
	
}
