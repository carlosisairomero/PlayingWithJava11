package com.carlosisairomero.java.streams._09_simple_reducers;

import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 20),
			new Movie("c", 30)
		);
		
		Long count = movies.stream().count();
		System.out.println("count(): " + count);
			
		boolean anyMatch = movies.stream().anyMatch(m -> m.getLikes() > 20);
		System.out.println("anyMatch(): " + anyMatch);
								
		boolean allMatch = movies.stream().allMatch(m -> m.getLikes() > 20);
		System.out.println("allMatch(): " + allMatch);

		boolean noneMatch = movies.stream().noneMatch(m -> m.getLikes() > 100);
		System.out.println("noneMatch(): " + noneMatch);

		Movie firstMovie = movies.stream().findFirst().get();
		System.out.println("firstMovie: " + firstMovie);

		Movie movieWithMaxLikes = movies.stream().max(Comparator.comparing(Movie::getLikes)).get();
		System.out.println("movieWithMaxLikes: " + movieWithMaxLikes);

	}
	
}
