package com.edu.Oops_Concepts.PART_1;

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

// Even though name is not Initialized, the code works because of the Constructor
// The Condition that name should be initialized satisfies as soon as a parameterized constructor Created
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
