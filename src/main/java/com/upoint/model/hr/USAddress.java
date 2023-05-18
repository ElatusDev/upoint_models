package com.upoint.model.hr;

public class USAddress extends Address {
	
	private String number;
	
	@Override 
	public String toString() {
		return new StringBuilder()
				.append(this.street).append(" ")
				.append(this.number).append(" ")
				.append(this.postalCode).append(" ")
				.append(this.city).append(" ")
				.append(this.state).append(" ")
				.append(this.country).append(".")
				.toString();
	}
	
	
}
