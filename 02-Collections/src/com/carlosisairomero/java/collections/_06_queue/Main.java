package com.carlosisairomero.java.collections._06_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		// Queue: a stack. 
		
		Queue<String> queue = new ArrayDeque<String>();
		
		queue.add("c");
		queue.add("b");
		queue.add("a");
		
		System.out.println(queue);
		System.out.println("queue.peek: " + queue.peek());
		queue.remove();
		System.out.println(queue);
		
	}
	
}
