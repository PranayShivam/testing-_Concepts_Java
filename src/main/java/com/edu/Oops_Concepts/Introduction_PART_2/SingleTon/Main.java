package com.edu.Oops_Concepts.Introduction_PART_2.SingleTon;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

        SingletonClass obj3 = SingletonClass.getInstance();
    }
}
