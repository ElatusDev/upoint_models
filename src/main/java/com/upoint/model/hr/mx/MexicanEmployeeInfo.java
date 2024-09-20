package com.upoint.model.hr.mx;

import com.upoint.model.hr.EmployeeInfo;

<<<<<<< HEAD
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mexican_employee_info")
public class MexicanEmployeeInfo extends EmployeeInfo {
	
	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mexican_employee_info_id")
	private Long id;
	
	@OneToOne
	private MexicanAddress address;
	
	
	
	
=======
	@Column(name = "mexican_employee_info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private MexicanAddress address;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7

}
