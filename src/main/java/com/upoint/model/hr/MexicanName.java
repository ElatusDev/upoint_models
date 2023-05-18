package com.upoint.model.hr;

public class MexicanName extends Name {

	private String secondName;
	private String secondLastName;
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(firstName).append(secondName)
				.append(lastName).append(secondLastName)
				.toString();
	}
	


	
}
