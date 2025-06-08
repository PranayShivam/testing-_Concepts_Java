package com.edu.Oops_Concepts.PART_2;

public class StaticBlocks {
    static int a =10;
    static int b;

    // Static blocks will only run once when the first Object is Created (i.e a) class is loaded for the first time
    static {
        System.out.println("Inside Static Block");
        b = a*5;
    }

    public static void main(String[] args) {
//        StaticBlocks blocks = new StaticBlocks(); // Initialization of objects
        System.out.println(StaticBlocks.b);

        // Static blocks runs only once even if the object is created for more than one time
//        StaticBlocks blocks1 = new StaticBlocks();

        /**
         * Order In which Static Block is loaded
         * All static elements are run First
         *
         */

        StaticBlocks a = new StaticBlocks();
        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);

        StaticBlocks.b =+3;

        StaticBlocks b = new StaticBlocks();
        System.out.println(StaticBlocks.a + " " + StaticBlocks.b);


    }
}
