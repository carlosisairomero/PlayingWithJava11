package com.carlosisairomero.java.streams._03_mapping;

import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		// map method
		
		System.out.println();
		System.out.println("map (method)");
		System.out.println();
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 15),
			new Movie("c", 20)
		);
		
		movies
			.stream() // [{"a", 10}, {"b", 15}, {"c", 20},]
			.map(movie -> movie.getName()) // ["a", "b", "c"]
			.forEach(System.out::println);
		
		// flat
		
		System.out.println();
		System.out.println("flatMap (method)");
		System.out.println();
		
		var stream1 = Stream.of(List.of(1,2,3), List.of(4,5,6)); 
		
		System.out.println("printing a stream of 2 lists:");
		stream1
			.forEach(System.out::println);
		
		var stream2 = Stream.of(List.of(1,2,3), List.of(4,5,6));
		
		System.out.println("printing a stream of only 1 list:");
		stream2
			.flatMap(list -> list.stream())
			.forEach(System.out::println);
		
	}
	
}
