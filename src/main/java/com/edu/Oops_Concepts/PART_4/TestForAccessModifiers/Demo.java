package com.edu.Oops_Concepts.PART_4.TestForAccessModifiers;

import com.edu.Oops_Concepts.PART_4.AccessModifiers;

public class Demo {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
//        accessModifiers.num; num is not accessible here as its set to default
//        accessModifiers.name = "String"; // Cannot be accessed because name is set to default
    }
}
