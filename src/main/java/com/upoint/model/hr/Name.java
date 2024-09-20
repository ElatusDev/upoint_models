package com.upoint.model.hr;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Name {

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
}