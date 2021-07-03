package com.carlosisairomero.java.lambdas._03_lambda_expressions;

public class Main {

	public static void main(String[] args) {
		
		/*
		  	Lambda Expressions instead of Anonymous Inner Classes
		 
			1- this lambda will work
			
				greet((String message) -> {
					System.out.println(message);
				});
			
			2- this lambda will work, too
			
				greet((message) -> {
					System.out.println(message);
				});
			
			3- this lambda will work, too
			
				greet(message -> {
					System.out.println(message);
				});
		
			4- this lambda will work, too
			
				greet(message -> System.out.println(message));
		*/
		
		Printer printer = message -> System.out.println(message); 
		greet(printer);
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}
	
}
