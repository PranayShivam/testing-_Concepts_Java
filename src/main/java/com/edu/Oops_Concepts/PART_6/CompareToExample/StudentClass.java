package com.edu.Oops_Concepts.PART_6.CompareToExample;

public class StudentClass implements Comparable<StudentClass>{
    String Name;
    int RollNo;
    float Marks;

    public StudentClass(String name, int rollNo, float marks) {
        Marks = marks;
        Name = name;
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return this.Marks+"";
    }

    @Override
    public int compareTo(StudentClass o) {
        int diff = (int) (this.Marks-o.Marks);
//        System.out.println(diff);
        return diff;
    }
}
