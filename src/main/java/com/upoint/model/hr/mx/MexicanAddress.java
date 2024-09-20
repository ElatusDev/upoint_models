package com.upoint.model.hr.mx;

import com.upoint.model.hr.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mexican_address")
public class MexicanAddress extends Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mexican_address_id")
	private Long id;
	
	@Column(name = "mexican_address_interior_number")
	private String interiorNumber;
	
	@Column(name = "mexican_address_exterior_number")
	private String exteriorNumber;
	
	@Column(name = "mexican_addres_neighborhood")
	private String neighborhood;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.append(this.street).append(" ")
				.append(this.exteriorNumber).append(" ")
				.append(this.interiorNumber).append(", ")
				.append(this.postalCode).append(" ")
				.append(this.neighborhood).append(", ")
				.append(this.city).append(", ")
				.append(this.state).append("; ")
				.append(this.country).append(".")
				.toString();
				
		
	}
	

}
