package com.upoint.model.hr;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Address {
	
	@Column(name = "address_street")
	protected String street;
	
	@Column(name = "address_postal_code")
	protected String postalCode;
	
	@Column(name = "address_city")
	protected String city;
	
	@Column(name = "address_state")
	protected String state;
	
	@Column(name = "address_country")
	protected String country;
	
	
		

}
