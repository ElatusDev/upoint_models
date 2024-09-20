package com.upoint.model.hr;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Address {
	
<<<<<<< HEAD
	@Column(name = "address_street")
	protected String street;
	
	@Column(name = "address_postal_code")
	protected String postalCode;
	
	@Column(name = "address_city")
	protected String city;
	
	@Column(name = "address_state")
	protected String state;
	
	@Column(name = "address_country")
=======
	@Column(name = "address_street", nullable = false, length = 40)
	protected String street;
	
	@Column(name = "address_postal_code", nullable = false, length = 10)
	protected String postalCode;
	
	@Column(name = "address_city", nullable = false, length = 40)
	protected String city;
	
	@Column(name = "address_state", nullable = false, length = 25 )
	protected String state;
	
	@Column(name = "address_country", nullable = false, length = 30)
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	protected String country;

}
