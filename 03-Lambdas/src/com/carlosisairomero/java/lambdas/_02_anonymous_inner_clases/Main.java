package com.carlosisairomero.java.lambdas._02_anonymous_inner_clases;

public class Main {

	public static void main(String[] args) {
		/* 
			Anonymous Inner Class:
			Anonymous: because it doesn't have a name.
			Inner: because it's inside a method
		*/
		greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message);
			}
		});
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}
	
}
