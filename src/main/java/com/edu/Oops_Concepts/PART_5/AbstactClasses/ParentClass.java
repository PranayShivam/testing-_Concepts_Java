package com.edu.Oops_Concepts.PART_5.AbstactClasses;


/**
 * Abstract classes cannot be final
 * final prevents inheritance
 */
public abstract class ParentClass {

    String gender;

    abstract void career(String name);
    abstract void partner(String name, int age);

    /**
     * Abstract methods cannot be static;
     * cuz, Static methods cannot be overridden,
     * abstract classes needs to be overridden unless we cannot call them.
     * thus, static methods cannot be abstract
     */
//    static abstract void greeting();

    /**
     * we can create static methods as static methods dosen't depend of Objects to be created
     */
    static void welcome(){
        System.out.println("Hii There");
    }
}
