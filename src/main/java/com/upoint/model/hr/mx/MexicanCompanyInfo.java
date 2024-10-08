package com.upoint.model.hr.mx;

import com.upoint.model.hr.CompanyInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mexican_company_info")
public class MexicanCompanyInfo extends CompanyInfo {
	
	@Id
	@Column(name = "mexican_company_info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private MexicanAddress address;

}
