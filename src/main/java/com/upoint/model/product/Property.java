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
import jakarta.persistence.Table;

@Scope("prototype")
@Component
@Entity
@Table(name = "product_property")
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column( name = "property_name", nullable = false, length = 15)
	private String name;
	
	@Column(name = "property_unit", nullable = false, length = 10)
	private String unit;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name =  "property_available unit",
	joinColumns = {@JoinColumn(name = "property_available_unit_id"), @JoinColumn(name = "available_unit", nullable = true)})
	private List<String> availableUnits;
	
	@Column(name = "property_type", nullable = false, length = 10 )
	private String  valueType;
	
	
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
