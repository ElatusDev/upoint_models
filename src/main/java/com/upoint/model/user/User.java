package com.upoint.model.user;

<<<<<<< HEAD
import jakarta.persistence.Column;
=======
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

<<<<<<< HEAD
@Table(name = "user_")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;
	

=======
@Scope
@Component
@Entity
@Table (name = "user_")

public class User {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "user_id")
	private Long id;
	
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@ManyToOne
	private Role role;
	
	
	@OneToOne
	private Login login;
	
	
	
}
