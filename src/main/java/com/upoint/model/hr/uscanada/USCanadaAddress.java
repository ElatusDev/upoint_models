package com.upoint.model.hr.uscanada;

import com.upoint.model.hr.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "us_canada_address")
public class USCanadaAddress extends Address {
	
	@Id
	@Column(name = "us_canada_address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "us_canada_address_number")
	private String number;
	
	@Override 
	public String toString() {
		return new StringBuilder()
				.append(this.street).append(" ")
				.append(this.number).append(" ")
				.append(this.postalCode).append(" ")
				.append(this.city).append(" ")
				.append(this.state).append(" ")
				.append(this.country).append(".")
				.toString();
	}
	
	
}
