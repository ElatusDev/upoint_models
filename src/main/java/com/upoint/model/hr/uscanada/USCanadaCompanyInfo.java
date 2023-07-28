package com.upoint.model.hr.uscanada;

import com.upoint.model.hr.CompanyInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "us_canada_company_info")
public class USCanadaCompanyInfo extends CompanyInfo {
	
	@Id
	@Column(name = "us_canada_company_info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@OneToOne
	private USCanadaAddress address;
}
