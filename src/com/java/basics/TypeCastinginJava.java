package com.java.basics;

public class TypeCastinginJava {
	
	public static void main(String[] args) {
		
		/*
		 * There are 2 types of Type Casting
		 * 1. Widening type casting - Conversion of lower data types to higher types(Auto conversion)
		 * 2. Narrowing - Conversion of higher data type to lower data type. This is not auto conversion, we are
		 * explicitly converting.
		 */
		
		int a = 205;
		long b = a;
		System.out.println(b);
		
		int d = 100;
		byte b1 = (byte) d;
		System.out.println(b1);
		
	}

}
