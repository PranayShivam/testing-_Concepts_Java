package com.edu;

public class Temp {
    String s = "ABC";
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "Hello World";
        String str2 = new String("Hello World");

//        System.out.println(str == str1);
//        System.out.println(str == str2);
//        System.out.println(str.equals(str2));

        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("Inside Main Method: " + a + "and" + b);
        // Swap does not happen  because Java uses pass by value not pass by reference
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside Swap Method: " + a + "and" + b);
    }

    class A {
        final int VALUE = 10;
        final String NAME;

        public A(String name){
            this.NAME = name;
        }

//        void setNAME(String name){
//            this.NAME = name;
//        }
    }
}
