package com.carlosisairomero.java.generics._04_methods;

public class Main {

	public static void main(String[] args) {

		int maxNumber = Utils.max(20, 30);
		System.out.println(maxNumber);
		
		User user1 = new User("Michael", 20);
		User user2 = new User("Peter", 30);
		
//		User maxUser = Utils.max(user1, user2);
//		System.out.println(maxUser);
		
	}

}
