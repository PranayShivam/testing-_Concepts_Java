package com.edu.Oops_Concepts.PART_4.TestForAccessModifiers;

import com.edu.Oops_Concepts.PART_4.AccessModifiers;

// This is known as Is-a Relationship
public class Demo extends AccessModifiers{
    public static void main(String[] args) {

        // This is known as has-a Relationship
        AccessModifiers accessModifiers = new AccessModifiers();
        /**
         * String name is not accessible here as it's set to default Access, also known as Package_Private
         * Cannot be accessed because num is set to private: can be accessed with that class or using encapsulation
         */
//        accessModifiers.num;
//        accessModifiers.name = "String";
        accessModifiers.setNum(20);
        System.out.println(accessModifiers.getNum());

        accessModifiers.arr = new int[6];
//        accessModifiers.data = 11.1d;

        /**
         * protected data can be accessed via Inheritance only
         * Need to create an Object of Sub-Class i.e is Demo
         * data can only be accessed by the Sub class object not even the Class it-Self
         */
        Demo obj = new Demo();
        obj.data = 99.9d;

        // Insatnce Of
        Demo demo = new Demo();
        System.out.println(demo instanceof AccessModifiers);
    }
}

class Demo2 extends Demo {

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.data = 20.989d;

        System.out.println(demo2 instanceof AccessModifiers);
    }
}
