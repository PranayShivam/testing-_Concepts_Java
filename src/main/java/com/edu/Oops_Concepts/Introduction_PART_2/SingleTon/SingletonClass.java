package com.edu.Oops_Concepts.Introduction_PART_2.SingleTon;


// Singleton classes soul not have more than one instance
// Logically, we should not allow to call the constructor of the class
// Whenever, a constructor is called new Object is Created, so we need to stop creating Objects using Constructors
public class SingletonClass {

    private SingletonClass() {
    }

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        if (instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
