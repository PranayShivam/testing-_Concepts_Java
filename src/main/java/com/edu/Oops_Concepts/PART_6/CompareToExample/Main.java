package com.edu.Oops_Concepts.PART_6.CompareToExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentClass Pranay = new StudentClass("Pranay", 608, 75.5f);
        StudentClass Anurag = new StudentClass("Anurag", 630, 71.8f);
        StudentClass Shivam = new StudentClass("Shivam", 602, 65.8f);
        StudentClass Abhishek = new StudentClass("Abhishek", 629, 99.9f);
        StudentClass shovik = new StudentClass("shovik", 640, 55.7f);
        StudentClass Arpit = new StudentClass("Arpit", 645, 72f);
        StudentClass Sudanshu = new StudentClass("Sudanshu", 639, 81.23f);

//        if (Pranay.compareTo(Anurag) < 0) {
//            System.out.println(Anurag.Name + " has more marks than " + Pranay.Name);
//        }

        StudentClass[] studentClasses = {Pranay, Anurag, Shivam, Abhishek, shovik, Arpit, Sudanshu};
        System.out.println(Arrays.toString(studentClasses));

        /**
         * using default compare function in this.class
         */
        Arrays.sort(studentClasses);

        /**
         * using special compare function
         *Arrays.sort(studentClasses, new Comparator<StudentClass>() {
         *             @Override
         *             public int compare(StudentClass o1, StudentClass o2) {
         *                 return -(o1.RollNo - o2.RollNo);
         *             }
         *         });
         */
        Arrays.sort(studentClasses);
        /**
         * using lambda Expressions
         */
//        Arrays.sort(studentClasses, (o1, o2) -> -(o1.RollNo - o2.RollNo));

        System.out.println(Arrays.toString(studentClasses));
    }
}
