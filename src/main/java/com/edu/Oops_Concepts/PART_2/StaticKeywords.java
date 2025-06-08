package com.edu.Oops_Concepts.PART_2;

public class StaticKeywords {

    public static void main(String[] args) {

        System.out.println(Human.newName);
        Human human = new Human();
        System.out.println(human.name);
        Human A = new Human(10, "A", 1500, true);
        Human B = new Human(12, "B", 150, false);
        System.out.println(B.name);

        System.out.println(Human.population);
//        greeting(); // Non static method can't be called inside static method
    }

    // Not dependent on objects and it belongs to the class
    static void greet() {
    // greeting(); // non-Static method dependent on Instances
        System.out.println("greet");
    }

    // Something which is not static belongs to an object , its dependent on Objects
    void greeting() {
//        greet(); // No such limitation for accessing static from non-Static
        System.out.println("greeting");
    }
}
