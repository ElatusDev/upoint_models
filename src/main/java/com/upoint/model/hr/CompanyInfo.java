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

	
	@Column(name = "company_name", nullable = false, length = 150)
	private String name;
	
	@Column(name = "company_registration_id", nullable = false, length = 13)
	private String registrationId;
	
	@Column(name = "company_email", nullable = false, length = 50)
	private String email;
	
	@Column(name = "company_website_url", length = 35)
	private String websiteUrl;
}
