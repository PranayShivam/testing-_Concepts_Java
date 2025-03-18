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

    }
}
