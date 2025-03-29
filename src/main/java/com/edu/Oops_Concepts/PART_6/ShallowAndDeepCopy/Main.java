package com.edu.Oops_Concepts.PART_6.ShallowAndDeepCopy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy.Human Pranay = new ShallowCopy.Human(28, 'M', "Pranay");

        ShallowCopy.Human twin = (ShallowCopy.Human) Pranay.clone();
        System.out.println("Age: " + twin.age + ", Gender: " + twin.Gender + ", Name: " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[1] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Pranay.arr));  //Shallow Copy

        twin.age = 20;
        twin.name = "Kunal";
        twin.Gender = 'F';
        System.out.println("Age: " + twin.age + ", Gender: " + twin.Gender + ", Name: " + twin.name);
        System.out.println("Age: " + Pranay.age + ", Gender: " + Pranay.Gender + ", Name: " + Pranay.name);

//        ShallowCopy.Human HumanArr= new ShallowCopy.Human(new int[]{1, 2, 4, 56, 7});
//        ShallowCopy.Human twinArr = (ShallowCopy.Human) HumanArr.clone();
//        System.out.println(Arrays.toString(twinArr.arr));
//        twinArr.arr[2] = 100;
//        System.out.println(Arrays.toString(HumanArr.arr));
    }
}
