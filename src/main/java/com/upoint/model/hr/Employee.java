package com.upoint.model.hr;

<<<<<<< HEAD
import java.util.List;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;

@MappedSuperclass
public class Employee {

	
	@ManyToOne
	private Position position;
	
	
	
	

=======

import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public  class Employee {
	
	
	
	@ManyToOne
	private Position position;
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
