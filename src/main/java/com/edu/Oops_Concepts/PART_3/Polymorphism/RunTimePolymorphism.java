package com.edu.Oops_Concepts.PART_3.Polymorphism;


/*
 * This is an example of Run Time Polymorphism
 * Which is also known as Method Overriding
 */

/**
 * Overriding depends on objects
 * Static dose-not depend on Objects
 * Hence, Static methods cannot be overridden
 * But static methods can be inherited
 */
public class RunTimePolymorphism {

    public static class Parent {
        void sum(){
            System.out.println(2+4);
        }
    }

    public static class Child extends Parent{
       @Override
        void sum() {
            System.out.println("2" + "4");
        }
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        p.sum();

        Child c = new Child();
        c.sum();

        Parent pc = new Child();  // Up Casting
        pc.sum();

//        Child cp = new Parent(); // Down Casting not possible
//        cp.sum();
    }
}
/**
 * In Run Time Polymorphism
 * When we create a method in Parent class we can change the body in child class and add
 * @Override which is actually just way identify that this particular method  is being overridden
 *
 * Also, when we create ref var of Type Parent and object type is of Child, we see that pc.sum
 * navigates to the method in Parent class but when executed, the result is from the child class.
 */
