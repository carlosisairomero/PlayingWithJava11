package com.carlosisairomero.java.streams._13_partitioning;

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
		
		// 1- Movies partitioning by (likes > 20) && (likes <= 20) 
		
		Map<Boolean, List<Movie>> moviesPartition1 = movies.stream()
			.collect(Collectors.partitioningBy(
					m -> m.getLikes() >= 20))
			;
		
		System.out.println();
		System.out.println("1- Movies partitioning by (likes > 20) && (likes <= 20) ");
		System.out.println(moviesPartition1);
		
		// 2- Movies partitioning by (likes > 20) && (likes <= 20) 
		
		Map<Boolean, String> moviesPartition2 = movies.stream()
			.collect(Collectors.partitioningBy(
					m -> m.getLikes() >= 20,
					Collectors.mapping(
							Movie::getName, 
							Collectors.joining(","))))
			;
		
		System.out.println();
		System.out.println("2- Movies partitioning by (likes > 20) && (likes <= 20) ");
		System.out.println(moviesPartition2);
		
	}
	
}
