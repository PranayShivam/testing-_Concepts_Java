package com.edu.Oops_Concepts.Introduction;

public class Packages_Intro {
    public static void main(String[] args) {
        A obj = new A("Hello");
    }

    static class A {
        final int VALUE = 10;
        final String str;

        // Final Keyword is used for String str, which makes it compulsory to initialize it but
        // Using constructor that satisfies the requirement
        public A(String str) {
            this.str = str;
        }
    }
//    Temp T = new Temp();  // Import statement for Temp ->  import com.edu.demo.Temp;

}
