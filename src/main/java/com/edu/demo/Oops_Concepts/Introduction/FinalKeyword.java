package com.edu.demo.Oops_Concepts.Introduction;

public class FinalKeyword {
    public static void main(String[] args) {
        final int BONOUS = 2;
        A pr = new A("new");
//        pr.name = "Hii";  // Name can't be changed as its declared using final
        System.out.println(pr.name);
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Hello");
        }
    }

    static class A {
        final int VALUE = 10;
        final String name;

        public A(String name) {
            System.out.println("Obj Created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Obj is destroyed");
            super.finalize();
        }
    }
}
