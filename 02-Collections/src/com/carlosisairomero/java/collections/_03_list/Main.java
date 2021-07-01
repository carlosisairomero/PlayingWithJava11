package com.carlosisairomero.java.collections._03_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Just a list (order doesn't matter)
		
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "a", "b", "c", "a");
		
		System.out.println("indexOf(a): " + list.indexOf("a"));
		System.out.println("lastIndexOf(a): " + list.lastIndexOf("a"));
		
	}
	
}
