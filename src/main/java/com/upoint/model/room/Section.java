package com.upoint.model.room;

import java.util.List;
<<<<<<< HEAD

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.upoint.model.stockroom.StockProduct;


@Document
public class Section {

=======
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.upoint.model.stockroom.StockProduct;

@Document
public class Section {

	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@Id
	private Long id;
	
	
	private String label;
	
	
	private String color; 
	
	
	private Integer capacity;
	
	
	private List<StockProduct> products;
	
	
	private Location location;
	
	
}
