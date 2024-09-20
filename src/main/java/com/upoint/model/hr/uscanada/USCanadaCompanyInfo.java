package com.upoint.model.hr.uscanada;

import com.upoint.model.hr.CompanyInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "us_canada_company_info")
<<<<<<< HEAD
public class USCanadaCompanyInfo extends CompanyInfo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_canada_company_info_id")
	private Long id;
	
	@OneToOne
	private USCanadaAddress address;

=======
public class USCanadaCompanyInfo extends CompanyInfo {
	
	@Id
	@Column(name = "us_canada_company_info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@OneToOne
	private USCanadaAddress address;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
