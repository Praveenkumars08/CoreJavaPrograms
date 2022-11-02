package com.java.basics;

public class DoWhileLoopExample {
	
	public static void main(String[] args) {
		
		/**
		 * Explanation : In do while loop, first it will execute the statement at least once, and then
		 * it will check the condition. Even though if the condition is false the statement will be
		 * executed once. 
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
