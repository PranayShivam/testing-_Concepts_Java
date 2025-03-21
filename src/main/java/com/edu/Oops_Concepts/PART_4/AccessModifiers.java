package com.edu.Oops_Concepts.PART_4;

public class AccessModifiers {

    /**
     * There are 4 Types of access Modifiers in JAVA
     * Private: - Inside the particular class only
     * Protected
     * package-private: - Inside the same package, also known as Default (no modifiers needs to be specified)
     * public: - Available everywhere
     */

    private int num;    // Set as private
    String name;        // Set as package-private
    public int[] arr;   // Set as public


    // Using getters and setters for accessing and setting private variables from another class
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public AccessModifiers() {
    }

    public AccessModifiers(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


}
