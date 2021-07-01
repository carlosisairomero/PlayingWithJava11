package com.carlosisairomero.java.collections._02_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();
		Collections.addAll(collection, "a","b","c");
		System.out.println(collection);
		System.out.println("collection size: " + collection.size());
		collection.remove("a");
		System.out.println(collection);
		System.out.println("contains a?: " + collection.contains("a"));
		
		Collection<String> collection2 = new ArrayList<String>();
		collection2.addAll(collection);
		
		System.out.println(collection.equals(collection2));
		
	}

}
