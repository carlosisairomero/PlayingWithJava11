package com.carlosisairomero.java.streams._01_imperative_vs_declarative;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 15),
			new Movie("c", 20)
		);
		
		// Imperative way
		
		int count1 = 0;
		for (Movie movie : movies) {
			if (movie.getLikes() > 10) {
				count1 ++;
			}
		}
		System.out.println("count1: " + count1);
		
		// Declarative way
		
		var count2 = movies
			.stream()
			.filter(movie -> movie.getLikes() > 10)
			.count();
		
		System.out.println("count2: " + count2);
		
	}
	
}
