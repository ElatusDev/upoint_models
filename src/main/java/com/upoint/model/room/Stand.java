package com.upoint.model.room;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.upoint.model.util.StandType;

@Document
public class Stand {

	@Id
	private Long id;
	
	
	private String label;
	
	
	private StandType type;
	
	
	private Integer maxColumn;
	
	
	private Integer maxRow;
	
	
	private List<Section> sections;
	
}
