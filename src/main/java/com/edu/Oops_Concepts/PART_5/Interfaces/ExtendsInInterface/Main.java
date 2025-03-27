package com.edu.Oops_Concepts.PART_5.Interfaces.ExtendsInInterface;

public class Main implements A, B {
    public static void main(String[] args) {
        B.greeting();
        Main obj = new Main();

    }

    /**
     * Access Modifiers in Overwritten methods should be better than the Base methods
     * For e.g., greet() is set to default modifier, which is more restricted than public
     */
    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }

}
