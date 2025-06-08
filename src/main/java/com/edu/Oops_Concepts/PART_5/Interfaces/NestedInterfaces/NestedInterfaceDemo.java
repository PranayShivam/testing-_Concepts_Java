package com.edu.Oops_Concepts.PART_5.Interfaces.NestedInterfaces;

public class NestedInterfaceDemo {
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements NestedInterfaceDemo.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

class Main{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.isOdd(4));
    }
}