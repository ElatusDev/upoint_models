package com.upoint.model.hr.mx;

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
@Table(name = "mexican_employee")
public class MexicanEmployee  extends Employee {
	
	@Id
	@Column(name = "mexican_employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	private MexicanName name;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	private MexicanEmployeeInfo employeeInfo;

	@OneToMany
	private List<MexicanEmployee> subordinates; 

}

