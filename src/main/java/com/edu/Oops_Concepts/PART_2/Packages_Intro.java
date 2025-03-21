package com.edu.Oops_Concepts.PART_2;

import static com.edu.Main.message;

public class Packages_Intro {
    public static void main(String[] args) {
        A obj = new A("Hello");
        message();
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
}
