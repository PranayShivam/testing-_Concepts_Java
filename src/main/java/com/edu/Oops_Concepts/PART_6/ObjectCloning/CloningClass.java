package com.edu.Oops_Concepts.PART_6.ObjectCloning;

public class CloningClass{

    /**
     * @cloneable
     * Even though a Cloneable() dose not has any autostart methods, still we implement cloneable Because
     * its way to tell JVM that this class can be cloned
     * Thus, the JVM Knows that its allowed to clone
     */
    public static class Human implements Cloneable{
        int age;
        String name;
        char Gender;

        //Copy Constructor
        public Human(Human NewHuman) {
            this.age = NewHuman.age;
            this.Gender = NewHuman.Gender;
            this.name = NewHuman.name;
        }

        //Parameterized Constructor
        public Human(int age, char gender, String name) {
            this.age = age;
            Gender = gender;
            this.name = name;
        }

        // Non-Parameterized Constructor
        public Human(){}

        /**
         * We can use both the methods below
         * 1. The method if called, we need to explicitly Cast it to Human
         * 2. We do not need to do the above
         */
        @Override
//        public Object clone() throws CloneNotSupportedException{
//            return super.clone();
//        }
        public Human clone() {
            try {
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return (Human) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
