package com.carlosisairomero.java.collections._08_map;

public class Customer {

	private String name;
	private String email;
	
	public Customer() {
		super();
	}

	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
