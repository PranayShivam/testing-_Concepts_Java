package com.edu.Oops_Concepts.PART_6;

import com.edu.Oops_Concepts.PART_6.CustomArrysAndGenerics.CustomGenericArrayListWithExtends;

public class Main {
    public static void main(String[] args) {
//        CustomArrayList list = new CustomArrayList();
//        list.add(10);
//        list.add(15);
//        list.add(15);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.set(1, 20);
//        list.set(9, 30);

//        System.out.println(list.size());
//        System.out.println(list);

//        CustomGenericArrayList<Integer> list1 = new CustomGenericArrayList<>();
//        list1.add(5);
//
//        for (int i = 0; i < 21; i++) {
//            list1.add(2*i);
//        }
//        System.out.println(list1);
        CustomGenericArrayListWithExtends<Integer> list1 = new CustomGenericArrayListWithExtends<>();
        list1.add(5);

        for (int i = 0; i < 21; i++) {
            list1.add(2*i);
        }
        System.out.println(list1);
        System.out.println(list1.get(10));
        System.out.println(list1.remove());
        list1.remove(40);
        System.out.println(list1);

    }
}
