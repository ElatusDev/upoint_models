package com.upoint.model.product;

import java.util.List;
<<<<<<< HEAD

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

=======
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Scope("prototype")
@Component
<<<<<<< HEAD
@Entity 
@Table(name = "product") 
public class Product  {
	
	@Id 
=======
@Entity
@Table(name = "product")
public class Product  {
	
	@Id
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;
	
	@Column(name = "product_code", nullable = false, length = 16)
<<<<<<< HEAD
	private String code; 
=======
	private String code;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	
	@Column(name = "product_name", nullable = false, length = 25)
	private String name;
	
	@Column(name = "product_description", nullable = true, length = 250)
	private String description;
	
<<<<<<< HEAD
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "product_category_id", nullable = false)
	private Category category;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "product_property", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "property_id"))
	private List <Property> properties;
	
	@Column(name = "product_company_id", nullable = false)
	private Long companyId;
	
	public String getCode() {
=======
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "product_category_id", nullable = false)
	private Category category;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "product_property_association", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "property_id"))
	private List <Property> properties; 
	
	@Column(name = "product_company_id")
	private Long companyId;
	
	public Long getCompanyId() {
		return companyId;  
	}
	
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	
	public String getCode() { 
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
<<<<<<< HEAD
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
=======

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
