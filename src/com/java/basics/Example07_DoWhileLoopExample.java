package com.java.basics;

public class Example07_DoWhileLoopExample {
	
	public static void main(String[] args) {
		
		/**
		 * Explanation : In do while loop, first it will execute the statement at least once, and then
		 * it will check the condition. Even though if the condition is false the statement will be
		 * executed once. It is mandatory to either increment or decrement the value or else the
		 * condition will always be true and stuck in an infinite loop.
		 */
		
		int a = 10;
		int i = 111;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=a);
		
		System.out.println("==================");
		
		int b = 1;
		int j = 10;
		
		do {
			System.out.println(j);
			j--;
		}
		while(j>=b);
	}

}
