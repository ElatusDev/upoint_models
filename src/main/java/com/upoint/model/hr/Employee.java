package com.upoint.model.hr;

import java.util.List;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;

@MappedSuperclass
public class Employee {

	
	@ManyToOne
	private Position position;
	
	
	
	

}
