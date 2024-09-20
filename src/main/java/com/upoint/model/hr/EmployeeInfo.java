package com.upoint.model.hr;

<<<<<<< HEAD
import java.time.LocalDate;
=======
import java.sql.Date;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
<<<<<<< HEAD
public class EmployeeInfo {
	
	@Column(name = "employee_info_cellphone")
	private String cellphone;
	
	@Column(name = "employee_info_emergency_contact")
	private String emergencyContact;
	
	@Column(name = "employee_info_birthday")
	private LocalDate birthday;
=======
public class EmployeeInfo  {

	@Column(name = "employee_info_cellphone", nullable = false, length = 10)
	private String cellphone;
	
	@Column(name = "employee_info_emergency_contact", nullable = false, length = 10) 
	private String emergencyContact;
	
	@Column(name = "employee_info_birthday")
	private Date birthday;
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}

