package com.upoint.model.product;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Scope("prototype")
@Component
@Entity 
@Table(name = "product_property") 
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "property_id")
	private Integer id;
	
	@Column(name = "property_name", nullable = false, length = 15)
	private String name;
	
	@Column(name = "property_unit", nullable = false, length = 10)
	private String unit;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "property_available_unit",
	joinColumns = {@JoinColumn(name = "property_available_unit_id")})
	@Column(name = "available_unit")
	private List<String> availableUnits;
	
	@Column(name = "property_type", nullable = false, length = 10)
	private String valueType;
	
	@OneToMany(mappedBy = "properties")
	private List<Product> products;
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public List<String> getAvailableUnits() {
		return availableUnits;
	}
	public void setAvailableUnits(List<String> availableUnits) {
		this.availableUnits = availableUnits;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	
	
	
		

}
