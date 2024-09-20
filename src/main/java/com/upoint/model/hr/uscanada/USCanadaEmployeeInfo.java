package com.upoint.model.hr.uscanada;


import com.upoint.model.hr.EmployeeInfo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "us_canada_employee_info")
public class USCanadaEmployeeInfo extends EmployeeInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_canada_employee_info_id")
	private Long id;
	
	@OneToOne
	private USCanadaName name;

	@OneToOne
	private USCanadaAddress address;
}
