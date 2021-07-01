package com.carlosisairomero.java.collections._04_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer("b"));
		customers.add(new Customer("a"));
		customers.add(new Customer("c"));
		
		System.out.println(customers);
		Collections.sort(customers);
		System.out.println(customers);
		
	}
}
