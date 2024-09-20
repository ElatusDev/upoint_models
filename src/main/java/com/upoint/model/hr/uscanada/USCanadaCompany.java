package com.upoint.model.hr.uscanada;

import java.util.List;

import com.upoint.model.hr.Company;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
<<<<<<< HEAD

@Entity
@Table(name = "us_canada_company")
public class USCanadaCompany extends Company{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_canada_company_id")
	private Long id;

=======
@Entity
@Table(name = "us_canada_company")
public class USCanadaCompany extends Company {
	
	@Id
	@Column(name = "us_canada_company_address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@OneToOne
	private USCanadaCompanyInfo companyInfo;
	
	@OneToMany
<<<<<<< HEAD
	private List<USCanadaEmployee> rootEmployees; 
=======
	private List <USCanadaEmployee> rootEmployees; 

>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
