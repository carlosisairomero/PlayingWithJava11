package com.carlosisairomero.java.collections._04_comparable;

public class Customer implements Comparable<Customer> {

	private String name;

	public Customer() {
		super();
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Customer o) {
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}
