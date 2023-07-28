package com.upoint.model.hr;

import java.util.List;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;

@MappedSuperclass
public class Company {

	@OneToMany
	private List<Position> rootPositions;
	
	
	
	 

}
