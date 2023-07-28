package com.upoint.model.hr.mx;

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

@Entity
@Table(name = "mexican_employee_info")
public class MexicanEmployeeInfo extends EmployeeInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mexican_employee_info_id")
	private Long id;
	
	@OneToOne
	private MexicanAddress address;
	
	
	
	

}
