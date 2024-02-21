package com.upoint.model.hr;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Address {
	
	@Column(name = "address_street", nullable = false, length = 40)
	protected String street;
	
	@Column(name = "address_postal_code", nullable = false, length = 10)
	protected String postalCode;
	
	@Column(name = "address_city", nullable = false, length = 40)
	protected String city;
	
	@Column(name = "address_state", nullable = false, length = 25)
	protected String state;
	
	@Column(name = "address_country", nullable = false, length = 30)
	protected String country;
	
	
		

}
