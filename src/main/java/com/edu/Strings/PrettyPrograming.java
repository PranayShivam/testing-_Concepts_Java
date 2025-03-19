package com.edu.Strings;

public class PrettyPrograming {
    public static void main(String[] args) {

        float f = 23.5656f;
        System.out.printf("Float till 2 decimals: %.2f %n" , f); // Formated String -> Printf
        // The above example Rounds of the Values as well

        System.out.println(Math.PI);
        System.out.printf("PI Till 4 Decimals: %.4f %n", Math.PI);

        // For Strings
        System.out.printf("Hi, My Name is %s", "Pranay"); // Variables should be placed as per the placeholders

        /**
-----------------         -------  List of Format Specifiers in Java   ----------           ----------------
         * %d	Integer (decimal)	            System.out.printf("%d", 42);	                    42
         * %f	Floating-point (decimal)	    System.out.printf("%.2f", 3.14159);	                3.14
         * %s	String	                        System.out.printf("%s", "Java");	                Java
         * %c	Character	                    System.out.printf("%c", 'A');	                    A
         * %b	Boolean	                        System.out.printf("%b", true);	                    true
         * %n	New Line(platform-independent)	System.out.printf("Hello%nWorld");	                Hello (new line) World
         * %%	Percent Sign	                System.out.printf("Discount: 10%%");	            Discount: 10%

------------------   --------   ADVANCED SPECIFIERS ------------        --------------------------------------
         * %e	Scientific notation (exponential)	    System.out.printf("%e", 1234.56);	        1.234560e+03
         * %g	Compact floating-point (auto %f or %e)	System.out.printf("%g", 0.000123456);	    1.23456e-04
         * %o	Octal number	                        System.out.printf("%o", 10);	            12
         * %x	Hexadecimal (lowercase)	                System.out.printf("%x", 255);	            ff
         * %X	Hexadecimal (uppercase)	                System.out.printf("%X", 255);	            FF
         */

    }
}

