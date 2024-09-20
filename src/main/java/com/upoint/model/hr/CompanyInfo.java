package com.upoint.model.hr;

import jakarta.persistence.Column;
<<<<<<< HEAD
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
=======
import jakarta.persistence.MappedSuperclass;

>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7

@MappedSuperclass
public class CompanyInfo {

<<<<<<< HEAD
	
	@Column(name = "company_name")
	private String name;
	
	@Column(name = "company_registration_id")
	private String registrationId;
	
	@Column(name = "company_email")
	private String email;
	
	@Column(name = "company_website_url")
=======
	@Column(name = "company_name", nullable = false, length = 150)
	private String name;
	
	@Column(name = "company_registration_id", nullable = false, length = 13)
	private String registrationId;
	
	@Column(name = "company_email", nullable = false, length = 50)
	private String email;
	
	@Column(name = "company_website_url", length = 35)
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	private String websiteUrl;
}
