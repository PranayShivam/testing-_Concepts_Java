package com.edu.Oops_Concepts.PART_6.ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloningClass.Human Pranay = new CloningClass.Human(28, 'M', "Pranay");
//        CloningClass.Human twin = new CloningClass.Human(Pranay);

        CloningClass.Human twin = Pranay.clone();
        System.out.println("Age: " + twin.age + ", Gender: " + twin.Gender + ", Nme: " + twin.name);
    }
}
