package com.upoint.model.hr.uscanada;

import com.upoint.model.hr.CompanyInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "us_canada_company_info")
public class USCanadaCompanyInfo extends CompanyInfo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_canada_company_info_id")
	private Long id;
	
	@OneToOne
	private USCanadaAddress address;

}
