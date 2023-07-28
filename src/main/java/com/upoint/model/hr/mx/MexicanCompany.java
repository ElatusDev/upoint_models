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

@Entity
@Table(name = "mexican_company")
public class MexicanCompany extends Company{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mexican_company_id")
	private Long id;
	
	@OneToOne
	private MexicanCompanyInfo companyInfo;
	
	@OneToMany
	private List<MexicanEmployee> rootEmployees; 

}
