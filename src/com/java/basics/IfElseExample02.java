package com.java.basics;

public class IfElseExample02 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		
		else if(b>c) {
			System.out.println("B is greater");
		}
		
		else {
			System.out.println("C is greater");
		}
		
		/**
		 * Here, Let's compare 3 values and find out which one is greater.
		 * In the first if condition it will check if a is greater than b also if a is greater than c
		 * If both the condition is satisfied then only it will execute the statement.
		 * If condition is not satisfied then it will come into else part and check if the condition satisfies
		 * if the condition is satisfied it will execute that particular statement. If not then finally it
		 * come to the else part and execute the final statement.
		 */
		
	}

}

