package com.upoint.model.room;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.upoint.model.stockroom.StockProduct;


@Document
public class Section {

	@Id
	private Long id;
	
	
	private String label;
	
	
	private String color; 
	
	
	private Integer capacity;
	
	
	private List<StockProduct> products;
	
	
	private Location location;
	
	
}
