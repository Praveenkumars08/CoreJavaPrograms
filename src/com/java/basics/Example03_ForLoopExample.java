package com.java.basics;

public class Example03_ForLoopExample {
	
	public static void main(String[] args) {
		
		/**
		 * Example 01 : Printing 1 to 10 using for loop
		 * Explanation : initially i value will be 1, it will check if the value is lesser than
		 * or equal to 10. If the condition satisfies it will come into the loop and print the value
		 * of i. After that i++, which means i value will be incremented by 1. Then i=2 and the same
		 * process will follow.
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		/**
		 * Example 02 : printing 10 to 1 using for loop
		 * Explanation : initially i value will be 10, it will check if the value is greater than 
		 * or equal to 1. If the condition satisifes it will come into the loop and print the value
		 * of i. After that i--, which means i value will be decremented by 1. Then i=9 and the same
		 * process will follow.
		 */
		System.out.println("========");
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}

}
