package com.carlosisairomero.java.streams._07_unique;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 15),
			new Movie("c", 20),
			new Movie("d", 20)
		);
		
		System.out.println("All values\n");
		
		movies.stream()
			.map(Movie::getLikes)
			.forEach(System.out::println);

		System.out.println("\nUnique values\n");
		
		movies.stream()
		.map(Movie::getLikes)
		.distinct()
		.forEach(System.out::println);

	}
	
}
