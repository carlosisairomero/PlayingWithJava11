package com.carlosisairomero.java.lambdas._09_composing_functions;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
	
		/*
		 	Let's supose we need to transform this: "key:value" to "key=value" (1st lambda)
		 	Then we need to transform this: "key=value" to "{key=value}" (2nd lambda)
		*/
		
		String msg = "key:value";
		
		Function<String, String> replaceColonToEquals = str -> str.replace(":", "=");
		Function<String, String> addCurlyBraces = str -> "{" + str + "}";
		
		// 1st way:
		
		String result1 = replaceColonToEquals.andThen(addCurlyBraces).apply(msg);
		System.out.println("1st way: " + result1);

		// 2nd way:
		
		String result2 = addCurlyBraces.compose(replaceColonToEquals).apply(msg);
		System.out.println("2nd way: " + result2);
		
	}
	
}
