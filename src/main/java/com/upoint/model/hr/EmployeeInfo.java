package com.upoint.model.hr;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class EmployeeInfo {
	
	@Column(name = "employee_info_cellphone")
	private String cellphone;
	
	@Column(name = "employee_info_emergency_contact")
	private String emergencyContact;
	
	@Column(name = "employee_info_birthday")
	private LocalDate birthday;
}

