package com.edu.Oops_Concepts.Polymorphysm;

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

public class PolymorphismWithFinal {

    public static class WithFinal {

        void noShow() {
            System.out.println("No Show in Parent Class");
        }
        final void show() {
            System.out.println("Show");
        }
    }

    public static class WithoutFinal extends WithFinal {
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
