package com.edu.Oops_Concepts.PART_4;

public class ObjectDemo {

    int num;
    float newNum;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo) obj).num && this.newNum == ((ObjectDemo) obj).newNum;
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String toString() {
        return String.valueOf(num);
    }

    public ObjectDemo(int num, float newNum) {
        this.num = num;
        this.newNum = newNum;
    }

    public ObjectDemo() {
        this.num = -1;
        this.newNum = -1;
    }

    public static void main(String[] args) {
//        ObjectDemo objectDemo = new ObjectDemo(10);
//        ObjectDemo objectDemo1 = new ObjectDemo(10);
//        ObjectDemo objectDemo2 = objectDemo;
//
//        System.out.println(objectDemo.hashCode());
//        System.out.println(objectDemo1.hashCode());
//        System.out.println(objectDemo2.hashCode());
//
//        System.out.println(objectDemo2.equals(objectDemo));
//        System.out.println(objectDemo2 == objectDemo);

        ObjectDemo objectDemo = new ObjectDemo(10, 21f);
        ObjectDemo objectDemo1 = new ObjectDemo(10, 21f);

        if (objectDemo1 == objectDemo) {
            System.out.println("Both Objects are ==");
        }

        if (objectDemo1.equals(objectDemo)) {
            System.out.println("Bth objects are equal");
        }

        System.out.println(objectDemo1 instanceof Object);

    }
}
