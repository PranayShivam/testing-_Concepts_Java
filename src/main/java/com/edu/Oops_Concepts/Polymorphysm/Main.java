package com.edu.Oops_Concepts.Polymorphysm;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shapes.area();
        square.area();
        triangle.area();
        circle.area();

//        Triangle triangle1 = new Shapes();
        Shapes shapes1 = new Triangle();
        shapes1.area();

//        Static method is not getting overridden because static methods are of the class and
//        dose-not require reference
        Shapes sp = new Square();
        sp.greeting();
        Shapes.greeting();

        shapes.setHiddenData(10);
        System.out.println(shapes.getHiddenData());

    }
}

/**
 * Overriding depends on objects
 * Static dose-not depend on Objects
 * Hence, Static methods cannot be overridden
 */