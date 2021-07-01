package com.carlosisairomero.java.collections._08_map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("a", "e1");
		Customer c2 = new Customer("b", "e2");
		
		Map<String, Customer> map = new HashMap<String, Customer>();
		map.put(c1.getEmail(), c1);
		map.put(c2.getEmail(), c2);
		
		System.out.println("map: " + map);
		System.out.println("does map contains key = e1?: " + map.containsKey("e1"));
		System.out.println("customer with key = e1: " + map.get("e1"));

		map.replace("e2", new Customer("e2", "new b"));
		System.out.println("map: " + map);
		
		// iterating a map
		
		System.out.println("Iterating the map keys");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("Iterating the map values");
		for (Customer customer : map.values()) {
			System.out.println(customer);
		}
		
		System.out.println("Iterating the map entries");
		for (var entry: map.entrySet()) {
			System.out.println(entry);
		}
		
	}
	
}
