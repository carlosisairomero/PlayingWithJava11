package com.carlosisairomero.java.streams._10_reducing_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		List<Movie> movies = List.of(
			new Movie("a", 10),
			new Movie("b", 20),
			new Movie("c", 30)
		);
		
		// 1st way
		
		Optional<Integer> sum = movies.stream()
			.map(m -> m.getLikes())
			.reduce((m1, m2) -> m1 + m2);
		
		System.out.println("reducer (sum): " + sum.orElse(0));

		// 2nd way
		
		Integer summ = movies.stream()
				.map(m -> m.getLikes())
				.reduce(0, Integer::sum);
		
		System.out.println("reducer (summ): " + summ);

	}
	
}
