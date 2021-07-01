package com.carlosisairomero.java.collections._01_iterables;

public class Main {
	
	public static void main(String[] args) {
		
		GenericList<String> list = new GenericList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		for (String string : list) {
			System.out.println(string);
		}
	}
	
}
