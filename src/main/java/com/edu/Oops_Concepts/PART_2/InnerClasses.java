package com.edu.Oops_Concepts.PART_2;

/**
 * Outside classes can't be static
 *          static public class InnerClasses {
 *              static class Test{
 *              }
 *          }
 *  Above not possible
  */

/**
 * NOTE:
 * A static class in java acts like a top level class
 * Doesn't depend on the instance of Outer class if any
 */
public class InnerClasses {

    /** Exception
     * Though I have a Static variable in Test4 similar to Test3
     * It will not work because a parameterized Constructor is Used
     */
    static class Test4 {
        static String name;
        public Test4(String name){
            this.name = name;
        }
    }

    // Only Object is Static
    class Test3 {
        static String name;
    }

    // Both class and Object is Static
    static class Test2 {
        static String name;
    }

    // Only Class is Static
    static class Test1 {
        String name;
    }

    // Both class and Object not Static
    class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
        public Test() {
        }
    }

    public static void main(String[] args) {
        InnerClasses outer = new InnerClasses();  // First, create an instance of the outer class
        Test a = outer.new Test(); // or Now create an instance of the inner class
//        or Test a = outer.new Test("Pranay");
        a.name = "No Static Object or Class";
        System.out.println(a.name);  // Output: Pranay

        Test1 test1 = new Test1();
        test1.name = "Staic class";
        System.out.println(test1.name);

        Test2.name = "Both Static";
        System.out.println(Test2.name);

        Test3.name = "Only Object Static";
        System.out.println(Test3.name);

        Test4 test4 = new Test4("Pranay");
        Test4 test41 = new Test4("Shivam");
        System.out.println(test4.name + " " + test41.name);
    }
}

