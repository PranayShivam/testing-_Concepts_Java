package com.edu.PracticeQuestions;

public class RecursionExample {

    /**
     * @param args
     *
     * Running this code will cause recursion error landing to Stack Overflow Error
     */
    public static void main(String[] args) {
        greeting();
    }

    static void greeting(){
        System.out.println("greeting is a static method");
       RecursionExample example = new RecursionExample();
       example.greet();
    }

    void greet()    {
        System.out.println("greet is a non static method");
        greeting();
    }
}
