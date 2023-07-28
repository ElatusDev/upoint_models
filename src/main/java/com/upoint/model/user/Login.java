package com.upoint.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "user_login")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id")
	private Long id;
	
	@Column(name = "login_email", nullable = false, length = 20)
	private String email;
	
	@Column(name = "login_pw", nullable = false, length = 15)
	private String pw;
	
	
}
