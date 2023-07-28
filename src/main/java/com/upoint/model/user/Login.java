package com.upoint.model.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Scope
@Component
@Entity
@Table (name = "user_login")
public class Login {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "long_id")
	private Long id;
	
	@Column(name = "user_email", nullable = false, length = 12 )
	private String email;
	
	@Column(name = "user_password", nullable = false, length = 16 )
	private String pw;
}
