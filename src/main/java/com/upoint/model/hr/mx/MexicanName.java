package com.upoint.model.hr.mx;

import org.springframework.stereotype.Component;

import com.upoint.model.hr.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_mexican_name")
@Component
public class MexicanName extends Name {
	
	@Id
	@Column(name = "mexican_name_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "mexican_name_second_name", length = 20, nullable = true)
	private String secondName;
	@Column(name = "mexican_name_second_last_name", length = 20, nullable = false )
	private String secondLastName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append(firstName).append(secondName)
				.append(lastName).append(secondLastName)
				.toString();
	}

}
