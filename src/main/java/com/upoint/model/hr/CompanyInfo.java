package com.upoint.model.hr;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

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
