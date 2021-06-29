package com.carlosisairomero.java.generics._03_comparable;

public class Main {
	
	public static void main(String[] args) {
		
		User michael = new User("Michael", 20);
		User peter = new User("Peter", 30);
		
		if(michael.compareTo(peter) < 1) {
			System.out.println("Michael is younger than Peter");
		}
		else if(michael.compareTo(peter) > 1) {
			System.out.println("Michael is greater than Peter");
		}
		else {
			System.out.println("Michael is equals than Peter");
		}
		
	}
	
}
