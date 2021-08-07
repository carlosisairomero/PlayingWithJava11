package com.carlosisairomero.java.streams._04_filtering;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 15),
			new Movie("c", 20)
		);
		
		movies
			.stream()
			.filter(movie -> movie.getLikes() >= 15)
			.forEach(System.out::println);
		
	}
	
}
