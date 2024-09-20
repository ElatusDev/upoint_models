package com.upoint.model.hr.uscanada;

import java.util.List;

import com.upoint.model.hr.Employee;
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


@Entity
@Table(name = "us_canada_employee")
public class USCanadaEmployee extends Employee {
	
	@Id
	@Column(name = "us_canada_employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	private USCanadaName name;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	private USCanadaEmployeeInfo employeeInfo;
	
	@OneToMany
	private List<USCanadaEmployee> subordinates;
}
