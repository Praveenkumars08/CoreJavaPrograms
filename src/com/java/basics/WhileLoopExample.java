package com.java.basics;

public class WhileLoopExample {
	
	public static void main(String[] args) {
		
		/**
		 * Explanation : First while loop will check the condition, if the condition is satisfied
		 * then it will come inside the loop and print the message. After printing the message
		 * we need to either increment or decrement the value. If we don't then the condition will
		 * always be true and will go into infinite loop.
		 * use case : When the number of iterations are not fixed (ie) we really don't know
		 * how many times the loop will run then we can use while loop.
		 */
		
		int a = 1;
		
		while(a<=10) {
			System.out.println("This loop will be executed 10 times");
			a++;
		}
		
		System.out.println("=======================================");
		
		int b = 10;
		
		while(b>=1) {
			System.out.println(b);
			b--;
		}
	}
}
