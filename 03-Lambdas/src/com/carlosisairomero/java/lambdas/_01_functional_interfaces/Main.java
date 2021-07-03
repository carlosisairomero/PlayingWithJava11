package com.carlosisairomero.java.lambdas._01_functional_interfaces;

public class Main {

	public static void main(String[] args) {
		greet(new ConsolePrinter());
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}
	
}
