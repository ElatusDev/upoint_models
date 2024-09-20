package com.upoint.model.hr;

import java.util.List;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;

<<<<<<< HEAD
@MappedSuperclass
public class Company {

	@OneToMany
	private List<Position> rootPositions;
	
	
	
	 
=======

@MappedSuperclass
public   class Company {
		
	
	@OneToMany
	private List <Position> rootPositions;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7

}
