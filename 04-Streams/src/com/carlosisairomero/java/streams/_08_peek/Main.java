package com.carlosisairomero.java.streams._08_peek;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 15),
			new Movie("c", 20)
		);
		
		System.out.println("Peek (for debugging)\n");
		
		movies.stream()
			.filter(m -> m.getLikes() > 10)
			.peek(m -> System.out.println("filtered: " + m.getName()))
			.map(Movie::getLikes)
			.peek(like -> System.out.println("mapped: " + like))
			.forEach(System.out::println);


	}
	
}
