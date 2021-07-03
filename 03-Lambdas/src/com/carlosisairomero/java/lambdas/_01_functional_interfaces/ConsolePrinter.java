package com.carlosisairomero.java.lambdas._01_functional_interfaces;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}
