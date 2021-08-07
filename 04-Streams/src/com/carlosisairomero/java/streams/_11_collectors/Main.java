package com.carlosisairomero.java.streams._11_collectors;

import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 20),
			new Movie("c", 30)
		);
		
		// 1- Get a List of Movies from a Stream
		
		List<Movie> moviesList = movies.stream()
			.filter(m -> m.getLikes() > 10)
			.collect(Collectors.toList())
			;
		
		System.out.println();
		System.out.println("1- Get a List of Movies from a Stream");
		System.out.println(moviesList);

	}
	
}
