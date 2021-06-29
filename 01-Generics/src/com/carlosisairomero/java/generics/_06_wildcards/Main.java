package com.carlosisairomero.java.generics._06_wildcards;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("name1", 10)
				, new Person("name2", 20)
				, new Person("name3", 30)
				);
		
		List<Worker> workers = Arrays.asList(
				new Worker("name1", 10, "Lawyer")
				, new Worker("name1", 20, "Doctor")
				, new Worker("name1", 30, "Carpenter")
				);
		
		Utils.printAsUsually(persons);
//		Utils.printAsUsually(workers); won't work
		
		Utils.printAsWildcard(workers);
	}
	
}
