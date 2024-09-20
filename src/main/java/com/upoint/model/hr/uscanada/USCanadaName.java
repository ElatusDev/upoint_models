package com.upoint.model.hr.uscanada;

import com.upoint.model.hr.Name;
<<<<<<< HEAD

=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "us_canada_name")
public class USCanadaName extends Name {
<<<<<<< HEAD
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_canada_name_id")
	private Integer id;
	
	

	

=======

	@Id
	@Column(name = "us_canada_name_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
