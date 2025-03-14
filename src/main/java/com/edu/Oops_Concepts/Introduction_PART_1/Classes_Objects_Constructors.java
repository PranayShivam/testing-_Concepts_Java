package com.edu.Oops_Concepts.Introduction_PART_1;


/** Scroll Till END */

public class Classes_Objects_Constructors {
    public static void main(String[] args) {

        // int rollNo, String name, float marks -> are reference Variable
        /**
         * int a = 10 --> primitive variable stored in stack
         * int a --> primitive variable with no value stored in stack
         * String s = "Hello"  --> 's' stored in stack but "Hello" Stored in heap
         * Objects are stored in heap but not in case of Primitives
         */
        int rollNo[] = new int[5];
        String name[] = new String[5];
        float marks[] = new float[5];

        Student[] student = new Student[5];
        // Initializing an array of Students
        student[0] = new Student(1, "Pranay", 78.5f);
        student[1] = new Student(1, "Pranay", 78.5f);
        student[2] = new Student(1, "Pranay", 78.5f);
        student[3] = new Student(1, "Pranay", 78.5f);
        student[4] = new Student(1, "Pranay", 78.5f);

        for (int i = 0; i < student.length; i++) {
            student[i].display();
        }

        Student pranay = new Student(10, "Pranay", 30);  // Student() -> constructor
        System.out.println(pranay.roll + pranay.name + pranay.marks );
    }
}

/**
 * Class is a named group of Properties and Methods
 * Classes are like templates (No physical Existence in memory
 * Objects created are like instances of that class that is stored in Memory
 * Objects has physical Existence in Memory
 */
class Student {

    // Instance Variable  : roll, name, marks
    int roll;
    String name;
    float marks;

    /** Below is an example of Method Overloading */
    void greeting() {
        int a = 10;  // Local Variable -> initialized only when this method is called
        System.out.println("Hello " + name);
    }

    void greeting(String name) {
        int a = 10;  // Local Variable -> initialized only when this method is called
        this.name = name;
        System.out.println("Hello " + this.name);
    }

    /** Below is an example of Constructor Overloading */
    public Student(int roll,String name,float marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public Student(){
//    // Calling one constructor from another
//        this(10, "Hello", 30f);
    }

    void display() {
        System.out.println("Student Name: "+ name);
        System.out.println("Student Roll: "+ roll);
        System.out.println("Student Marks: "+ marks);
    }

    void setName(String name) {
        this.name = name;
    }
    void setRoll(int roll) {
        this.roll = roll;
    }
    void setMarks(float marks) {
        this.marks = marks;
    }
}

    /**
     * This is a constructor
     * @param roll
     * @param name
     * @param marks
     * No return type needed not even void
     * Should have same name as the class name
     * used to initialize instance variables
     * called implicitly
     * public Student(int roll, String name, float marks) {
     *         this.roll = roll;
     *         this.name = name;
     *         this.marks = marks;
     *     }
     *
     * This is a Method
     * Must have a return type
     * can have any name
     * used for performing actions (here initialization of instance var should be done in constructor
        and not inside method

     *  Called explicitly
     *  void Student(int roll, String name, float marks) {
     *         this.roll = roll;
     *         this.name = name;
     *         this.marks = marks;
     *     }
     */
