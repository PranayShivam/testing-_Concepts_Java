package com.edu.Oops_Concepts.PART_4;

public class AccessModifiers {

    /**
     * There are 4 Types of access Modifiers in JAVA
     * Private: - Inside the particular class only
     * Protected
     * package-private: - Inside the same package, also known as Default (no modifiers needs to be specified)
     * public: - Available everywhere
     */

    /**  Detailed Information
     * Access Modifier	        Same Class      Same Package	Subclass (Different Package)	Non-Subclass (Different Package)
     * private	                ✅ Yes           ❌ No	        ❌ No	                        ❌ No
     * default (no modifier)	✅ Yes	        ✅ Yes	        ❌ No	                        ❌ No
     * protected	            ✅ Yes	        ✅ Yes	        ✅ Yes (Only via inheritance!)	❌ No
     * public	                ✅ Yes	        ✅ Yes	        ✅ Yes	                        ✅ Yes
     */

    private int num;    // Set as private
    String name;        // Set as package-private
    public int[] arr;   // Set as public
    protected double data;


    // Using getters and setters for accessing and setting private variables from another class
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public AccessModifiers() {
    }

    public AccessModifiers(int num, String name, double data) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
        this.data = data;
    }


}
