package com.edu.Oops_Concepts.PART_6.ShallowAndDeepCopy;

public class ShallowCopy {

    /**
     * @cloneable
     * Even though a Cloneable() dose not has any autostart methods, still we implement cloneable Because
     * its way to tell JVM that this class can be cloned
     * Thus, the JVM Knows that its allowed cloning this class objects
     */
    public static class Human implements Cloneable{
        int age;
        String name;
        char Gender;
        int[] arr;

        //Parameterized Constructor
        public Human(int age, char gender, String name) {
            this.age = age;
            this.Gender = gender;
            this.name = name;
            this.arr = new int[]{1, 2, 4, 5, 6};
        }

        public Human(int[] arr){
            this.arr = arr;
        }

        /**
         * We can use both the methods below
         * 1. The method if called, we need to explicitly Cast it to Human
         * 2. We do not need to do the above
         */
        @Override
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
}
