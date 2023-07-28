package com.upoint.model.hr;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;


@MappedSuperclass
public class CompanyInfo {

	@Column(name = "company_name")
	private String name;
	
	@Column(name = "company_registration_id")
	private String registrationId;
	
	@Column(name = "company_email")
	private String email;
	
	@Column(name = "company_website_url")
	private String websiteUrl;
}
