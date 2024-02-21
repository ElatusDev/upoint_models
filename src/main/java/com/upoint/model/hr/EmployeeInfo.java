package com.upoint.model.hr;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class EmployeeInfo  {

	@Column(name = "employee_info_cellphone", nullable = false, length = 10)
	private String cellphone;
	
	@Column(name = "employee_info_emergency_contact", nullable = false, length = 10) 
	private String emergencyContact;
	
	@Column(name = "employee_info_birthday")
	private Date birthday;
	
}

