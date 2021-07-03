package com.carlosisairomero.java.lambdas._12_binaryoperator;

import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {

		BinaryOperator<Integer> add = (a, b) -> a + b;
		
		Integer result = add.apply(2, 2);
		System.out.println(result);
		
	}
	
}
