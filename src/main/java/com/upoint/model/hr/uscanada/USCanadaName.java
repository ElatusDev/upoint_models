package com.upoint.model.hr.uscanada;

import com.upoint.model.hr.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "us_canada_name")
public class USCanadaName extends Name {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_canada_name_id")
	private Integer id;
	
	

	

}
