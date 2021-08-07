package com.carlosisairomero.java.streams._05_slicing;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 15),
			new Movie("c", 20),
			new Movie("d", 5)
		);
		
		// limit
		
		System.out.println("limit the first 2 elements\n");
		movies.stream()
			.limit(2)
			.forEach(System.out::println);
		
		// skip
		
		System.out.println("\nskip the first 2 elements\n");
		movies.stream()
			.skip(2)
			.forEach(System.out::println);
		
		// takeWhile
		
		System.out.println("\ntake while like < 20 \n");
		movies.stream()
			.takeWhile(movie -> movie.getLikes() < 20)
			.forEach(System.out::println);
		
		// dropWhile
		
		System.out.println("\ndrop while like < 20 \n");
		movies.stream()
			.dropWhile(movie -> movie.getLikes() < 20)
			.forEach(System.out::println);
		
	}
	
}
