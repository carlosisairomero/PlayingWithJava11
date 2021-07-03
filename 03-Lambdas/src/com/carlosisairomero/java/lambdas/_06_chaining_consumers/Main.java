package com.carlosisairomero.java.lambdas._06_chaining_consumers;

import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
	
		List<String> list = List.of("a", "b", "c");
		
		Consumer<String> print = item -> System.out.println(item);
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
		
		list.forEach(print.andThen(printUpperCase));
		
	}
	
}
