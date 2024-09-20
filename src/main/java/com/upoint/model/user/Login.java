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
import jakarta.persistence.Table;

<<<<<<< HEAD
@Table(name = "user_login")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id")
	private Long id;
	
	@Column(name = "login_email", nullable = false, length = 20)
	private String email;
	
	@Column(name = "login_pw", nullable = false, length = 15)
=======
@Scope
@Component
@Entity
@Table (name = "user_login")
public class Login {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_login")
	private Long id;
	
	@Column(name = "user_email", nullable = false, length = 12 )
	private String email;
	
	@Column(name = "user_password", nullable = false, length = 16 )
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	private String pw;
	
	
}
