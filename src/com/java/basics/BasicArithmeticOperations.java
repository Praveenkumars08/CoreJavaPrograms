package com.java.basics;

public class BasicArithmeticOperations {

	public static void main(String[] args) {
		
		/*
		 * 1) If we divide both the numbers by integer, the resultant also will be integer only.
		 * 2) If any one of the number is floating point value, then the output will be in float.
		 * 3) If we try to divide an integer number by 0. It will throw us Arithmetic Exception
		 * 4) If we try to divide a floating number by 0, It will give us infinity(This is the way java
		 * compiler is designed for decimal or double values)
		 * 5) If we are trying to divide (0.0/0), (0/0.0), (0.0/0.0), this will give us NaN (Not a number)
		 * 6) If 0 is divided by any other number, the resultant will be 0.
		 */
		
		
		/*
		 *System.out.println(8/2); --> It will return the quotient integer value
		 *System.out.println(24.0/2); --> It will return the output in float value.
		 *System.out.println(15/0); --> This line will throw arithmetic exception
		 *System.out.println(35.98/0); -->This line will give us infinity
		 *System.out.println(0.0/0); -->This line will give us NaN
		 *System.out.println(0/8); --> It will give us 0
		*/

	}

}
