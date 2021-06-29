package com.carlosisairomero.java.generics._04_methods;

public class Utils {

	public static <T extends Comparable<T>> T max(T first, T second) {
		return (first.compareTo(second) > 0) ? first : second; 
	}
	
}
