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

@Entity
@Table(name = "us_canada_company")
public class USCanadaCompany extends Company {
	
	@Id
	@Column(name = "us_canada_company_address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private USCanadaCompanyInfo companyInfo;
	
	@OneToMany
	private List<USCanadaEmployee> rootEmployees;
}
