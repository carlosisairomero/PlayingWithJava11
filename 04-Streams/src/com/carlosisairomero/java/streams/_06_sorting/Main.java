package com.carlosisairomero.java.streams._06_sorting;

import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 15),
			new Movie("c", 20),
			new Movie("d", 5)
		);
		
		System.out.println("Sorting (1st way)\n");
		
		movies.stream()
			.sorted((m1,m2) -> m1.getLikes().compareTo(m2.getLikes()))
			.forEach(System.out::println);

		System.out.println("Sorting (2nd way)\n");
		
		movies.stream()
			.sorted(Comparator.comparing(Movie::getLikes))
			.forEach(System.out::println);
		
		System.out.println("\nSorting reverse\n");
		
		movies.stream()
			.sorted(Comparator.comparing(Movie::getLikes).reversed())
			.forEach(System.out::println);
		
	}
	
}
