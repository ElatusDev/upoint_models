package com.upoint.model.hr;

public class MexicanAddress extends Address {
	
	private String interiorNumber;
	private String exteriorNumber;
	private String neighborhood;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return builder.append(this.street).append(" ")
				.append(this.exteriorNumber).append(" ")
				.append(this.interiorNumber).append(", ")
				.append(this.postalCode).append(" ")
				.append(this.neighborhood).append(", ")
				.append(this.city).append(", ")
				.append(this.state).append("; ")
				.append(this.country).append(".")
				.toString();
				
		
	}
	

}
