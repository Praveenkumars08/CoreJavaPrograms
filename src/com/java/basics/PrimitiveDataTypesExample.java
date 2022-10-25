package com.java.basics;

public class PrimitiveDataTypesExample {
	
	public static void main(String[] args) {
		
        /*
         * Data Types in Java
         * Primitive Data Types - These data types can be stored directly inside the memory
         * Numerical Types - Integer, Float
         * 1. Integer
         * a) byte, b)short, c)int, d)long
         * byte  - byte can hold the values ranges between -128 to 127 and the size is 1 byte.
         * short - short can hold the values ranges between -32768 to 32767 and the size is 2 bytes.
         * int   - int can hold the values ranges between -2147483468 to 2147483467 and the size is 4 bytes.
         * long  - long can hold the values ranges between -2^64 to 2^64-1, and the size is 8 bytes.
         *--------------------------------------------------------------------------------------------------------
         * 2. Float - Float comes with decimal point values.
         * a) float, b)double
         * float - The size of the float is 4 bytes
         * double - The size of the long is 8 bytes.
         *--------------------------------------------------------------------------------------------------------
         * 3. char  - size of the character is 2 bytes. character should be written in single quote only
         * char is also a type of numeric, To store unicode characters it takes 2 bytes.
         *---------------------------------------------------------------------------------------------------------
         * 4. boolean - It can be either true or false, the size of the boolean is approximately 1bit.
         *---------------------------------------------------------------------------------------------------------
         *NOTE :- These byte, short, int, long, float, double, char, boolean are reserved keywords and should always
         *begin with small case.
         */

        //1. Integer type
        byte b1 = 120;
        short s1 = 550;
        int i1 = 8345719;
        long l1 = 293803990;
        System.out.println("Printing the Integral values");
        System.out.println("The byte value is :" +b1);
        System.out.println("The short value is :" +s1);
        System.out.println("The integer value is :" +i1);
        System.out.println("The long value is :" +l1);

        System.out.println("***********************************");

        //2. Float type
        float f1 = 893.893f;
        double d1 = 9389.0390391;
        System.out.println("Printing float values");
        System.out.println("The float value is :" +f1);
        System.out.println("The double value is :" +d1);

        System.out.println("***********************************");

        //3. Char type
        char c1 = 'P';
        char c2 = '9';
        char c3 = 68;
        char c4 = '@';
        System.out.println("Printing char data type values");
        System.out.println("The character c1 value is :" +c1);
        System.out.println("The character c1 value is :" +c2);
        System.out.println("The character c1 value is :" +c3);
        System.out.println("The character c1 value is :" +c4);

        System.out.println("***********************************");

        //4. Boolean type
        boolean bValue1 = true;
        boolean bValue2 = false;
        System.out.println("The bValue1 is :" +bValue1);
        System.out.println("The bValue2 is :" +bValue2);
	}

}
