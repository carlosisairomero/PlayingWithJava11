package com.carlosisairomero.java.streams._02_creating_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		// 1- Creating streams from collections
		
		System.out.println("1- Creating streams from collections");
		System.out.println();
		List<String> list = List.of("a", "b","c");
		Stream<String> stream1 = list.stream();
		stream1.forEach(System.out::println);
		System.out.println();
		
		// 2- Creating streams from arrays
		
		System.out.println("2- Creating streams from arrays\n");
		System.out.println();
		Integer[] numbers = {1, 2, 3};
		Stream<Integer> stream2 = Arrays.stream(numbers);
		stream2.forEach(System.out::println);
		System.out.println();
		
		// 3- Creating streams from an arbitrary number of objects
		
		System.out.println("3- Creating streams from an arbitrary number of objects");
		System.out.println();
		Stream<String> stream3 = Stream.of("a", "b", "c");
		stream3.forEach(System.out::println);
		System.out.println();
		
		// 4- Creating infinite/finite streams (1st way)
		
		System.out.println("4- Creating infinite/finite streams (1st way)");
		System.out.println();
		Stream<Double> stream4 = Stream.generate(() -> Math.random());
		stream4
			.limit(3) // comment this line to get an infinite stream
			.forEach(System.out::println);
		System.out.println();
		
		// 5- Creating infinite/finite streams (1nd way)
		
		System.out.println("5- Creating infinite/finite streams (1nd way)");
		System.out.println();
		Stream<Integer> stream5 = Stream.iterate(1, n -> n +1);
		stream5
			.limit(3) // comment this line to get an infinite stream
			.forEach(System.out::println);
		System.out.println();
		
	}
	
}
