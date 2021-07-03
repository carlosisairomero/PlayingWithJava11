package com.carlosisairomero.java.lambdas._04_method_references;

public class Main {

	public static void main(String[] args) {
		/*
			When we have a lambda that just pass the parameter to an existing method,
			we use method references
			
			instead of this:
			message -> System.out.println(message);
			
			we can use this:
			System.out::println;
			
		*/
		 
		greet(System.out::println);
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}
	
	public static void print(String message) {}
	
}
