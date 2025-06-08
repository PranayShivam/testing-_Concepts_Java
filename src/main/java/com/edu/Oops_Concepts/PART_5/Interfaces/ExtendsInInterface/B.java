package com.edu.Oops_Concepts.PART_5.Interfaces.ExtendsInInterface;

public interface B extends A {
    /**
     * Protected is not allowed inside Interfaces because it restricts the open nature of an Interface
     * Interface's are made to be available every where
     * below method call also be written as: public abstract void greet();
     */
    void greet();

    // all variables inside an interface are by default public static final
    public static final int VAL = 10;

    static void greeting() {
        System.out.println("Greeting in Interface B");
    }

}
