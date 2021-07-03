package com.carlosisairomero.java.lambdas._13_unaryoperator;

import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		UnaryOperator<Integer> add = a -> a + 2;
		UnaryOperator<Integer> multiply = a -> a * 2;
		
		Integer result = add.andThen(multiply).apply(2);
		System.out.println(result);
		
	}
	
}
