package com.upoint.model.item;

import java.util.List;

public class Property {
	private Integer id;
	private String name;
	private String unit;
	private List<String> availableUnits;
	private Class <?> valueType;
	
	
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
	public Class<?> getValueType() {
		return valueType;
	}
	public void setValueType(Class<?> valueType) {
		this.valueType = valueType;
	}
	
	
	
		

}
