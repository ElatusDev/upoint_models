package com.upoint.model.hr.mx;

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
@Table(name = "mexican_company")
public class MexicanCompany extends Company{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mexican_company_id")
=======
@Entity
@Table(name = "mexican_company")
public class MexicanCompany extends Company {
	
	@Id
	@Column(name = "mexican_company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	private Long id;
	
	@OneToOne
	private MexicanCompanyInfo companyInfo;
	
	@OneToMany
<<<<<<< HEAD
	private List<MexicanEmployee> rootEmployees; 

=======
	private List <MexicanEmployee> rootEmployees; 
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
