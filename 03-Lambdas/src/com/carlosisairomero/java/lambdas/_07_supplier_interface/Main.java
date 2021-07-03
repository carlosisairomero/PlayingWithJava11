package com.carlosisairomero.java.lambdas._07_supplier_interface;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
	
		Supplier<Double> randomDoubleLambda = () -> Math.random();
		Double randomDouble = randomDoubleLambda.get();
		System.out.println(randomDouble);
		
	}
	
}
