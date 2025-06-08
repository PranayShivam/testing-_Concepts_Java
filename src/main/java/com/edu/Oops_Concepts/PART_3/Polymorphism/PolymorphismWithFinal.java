package com.edu.Oops_Concepts.PART_3.Polymorphism;

/**
 * Early Binding and Late Binding

 * Late Binding
 * Means when a method is overridden, it is taken care at run time which method to execute
 * i.e method from Parent class or method from child Class

 * Late Binding
 * When we declare a method as final, in compile time only it gives an error stating the desired issue
 * this is known as Early Binding
 *
 * Final Methods can't be overridden
 * Final Classes cannot be Extended  i.e cannot be inherited by another class
 */

public final class PolymorphismWithFinal {

    public static class WithFinal {

        void noShow() {
            System.out.println("No Show in Parent Class");
        }

        final void show() {
            System.out.println("Show");
        }
    }

    public static class WithoutFinal extends WithFinal {

        static int a = 10;
        void print() {
            System.out.println("Print");
        }

        @Override
        void noShow() {
            System.out.println("No Show in Child CLass");
        }

        /**
         * Method cannot be over Ridden as Parent Class method is set to final
         */
       /* @Override
        void show() {
            System.out.println("Show in Not Final Class");
        }*/
    }

    public static void main(String[] args) {
        WithoutFinal wf = new WithoutFinal();
        WithFinal wf1 = new WithFinal();

    }
}

/**
 * If an outer class is final, it cannot be inherited, But still the outer classes can be inherited/Extended
 *  below is an Example
 */

class Test {
    static String a = "10";

    void Test1() {
        Test.a = "-1";
    }
}
class NewClass extends PolymorphismWithFinal.WithoutFinal{
//     PolymorphismWithFinal.WithoutFinal withoutFinal = new PolymorphismWithFinal.WithoutFinal();
}