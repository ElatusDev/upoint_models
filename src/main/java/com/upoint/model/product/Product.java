package com.upoint.model.product;

import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
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
@Entity
@Table(name = "product")
public class Product  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;
	
	@Column(name = "product_code", nullable = false, length = 16)
	private String code;
	
	@Column(name = "product_name", nullable = false, length = 25)
	private String name;
	
	@Column(name = "product_description", nullable = true, length = 250)
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "product_category_id", nullable = false)
	private Category category;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "product_property", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "property_id"))
	private List <Property> properties; 
	
	@Column(name = "product_company_id", nullable = false)
	private Long companyId;
	
	public Long getCompanyId() {
		return companyId;  
	}
	
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	
	public String getCode() { 
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

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
