package com.upoint.model.hr;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

<<<<<<< HEAD
@Entity
@Table(name = "employee_position")
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "position_id")
	private Long id;
	
	@Column(name = "position_name")
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee_position")
public class Position {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_position_id")
	
	private Long id;
	
	@Column(name = "position_name", nullable = false, length = 35)
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	private String name;
	
	@OneToMany
	private List<Position> subordinates;
}
