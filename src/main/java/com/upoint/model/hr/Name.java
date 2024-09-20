package com.upoint.model.hr;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
<<<<<<< HEAD
public class Name {
	
	
=======
public   class Name {
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@Column(name = "first_name", length = 20, nullable = false)
	protected String firstName;
	
	@Column(name = "last_name", length = 20, nullable = false)
	protected String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	
	
}