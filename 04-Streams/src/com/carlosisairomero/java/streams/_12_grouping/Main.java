package com.carlosisairomero.java.streams._12_grouping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10, Genre.THRILLER),
			new Movie("b", 20, Genre.ACTION),
			new Movie("c", 30, Genre.ACTION)
		);
		
		// 1- Movies grouping by Genre (Map<Genre, List<Movie>>) 
		
		Map<Genre, List<Movie>> moviesGroup1 = movies.stream()
			.collect(Collectors.groupingBy(Movie::getGenre))
			;
		
		System.out.println();
		System.out.println("1- Movies grouping by Genre (Map<Genre, List<Movie>>)");
		System.out.println(moviesGroup1);
		
		// 2- Movies grouping by Genre (Map<Genre, Set<Movie>>) 
		
		Map<Genre, Set<Movie>> moviesGroup2 = movies.stream()
			.collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()))
			;
		
		System.out.println();
		System.out.println("2- Movies grouping by Genre (Map<Genre, Set<Movie>>)");
		System.out.println(moviesGroup2);
		
		// 3- Movies grouping and counting by Genre 
		
		Map<Genre, Long> moviesGroup3 = movies.stream()
			.collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()))
			;
		
		System.out.println();
		System.out.println("3- Movies grouping and counting by Genre");
		System.out.println(moviesGroup3);
		
		// 4- Movies grouping by Genre and retrieving just the Movie name 
		
		Map<Genre, String> moviesGroup4 = movies.stream()
			.collect(Collectors.groupingBy(
					Movie::getGenre, 
					Collectors.mapping(Movie::getName, Collectors.joining(", "))))
			;
		
		System.out.println();
		System.out.println("4- Movies grouping by Genre and retrieving just the Movie name");
		System.out.println(moviesGroup4);

	}
	
}
