package com.upoint.model.hr.uscanada;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.upoint.model.hr.EmployeeInfo;
@Entity
@Table(name = "us_canada_employee_info")
public class USCanadaEmployeeInfo extends EmployeeInfo {
	
	@Id
	@Column(name = "us_canada_employee_info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private USCanadaAddress address;

	
}
