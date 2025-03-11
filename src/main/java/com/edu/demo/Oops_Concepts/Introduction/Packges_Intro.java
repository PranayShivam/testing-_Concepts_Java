package com.edu.demo.Oops_Concepts.Introduction;

public class Packges_Intro {
    public static void main(String[] args) {
        A obj = new A("Hello");
    }

    static class A {
        final int VALUE = 10;
        final String str;

        public A(String str) {
            this.str = str;
        }
    }
}
