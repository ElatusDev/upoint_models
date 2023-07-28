package com.upoint.model.hr;


import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public  class Employee {
	
	
	
	@ManyToOne
	private Position position;
	
}
