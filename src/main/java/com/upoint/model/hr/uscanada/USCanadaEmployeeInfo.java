package com.upoint.model.hr.uscanada;

<<<<<<< HEAD
import com.upoint.model.hr.EmployeeInfo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.upoint.model.hr.EmployeeInfo;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
@Entity
@Table(name = "us_canada_employee_info")
public class USCanadaEmployeeInfo extends EmployeeInfo {
	
	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_canada_employee_info_id")
	private Long id;
	
	@OneToOne
	private USCanadaName name;

	@OneToOne
	private USCanadaAddress address;
	
	
=======
	@Column(name = "us_canada_employee_info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private USCanadaAddress address;
	
	@OneToOne
	private USCanadaName name;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
