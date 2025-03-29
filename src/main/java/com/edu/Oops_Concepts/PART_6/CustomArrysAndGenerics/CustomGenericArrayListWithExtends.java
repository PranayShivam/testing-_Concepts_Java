package com.edu.Oops_Concepts.PART_6.CustomArrysAndGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Creating a Custom ArrayList with Default Size as 10
 * Methods to be added:
 * add(value)
 * remove(index)
 * get(index)
 * set(index, value)
 * size()
 * isEmpty
 */

/**
 * Wild Cards : extends Number
 * @param <T>
 */

@SuppressWarnings("unchecked")
public class CustomGenericArrayListWithExtends<T extends Number> {

    private Object[] arr;
    private static int DEFAULT_SIZE;
    private int size = 0;

    /**
     * Wild Cards example
     * The below class accepts only Number type List
     * and not the subclasses of number Class
     */
    public void wildCardExample(List<Number> list){
        System.out.println("hello WIld Card entry");
    }

    /**
     * Wild Cards example
     * The below class accepts only Number type List
     * as well as SubClasses of Number class
     */
    public void wildCardExampleExtends(List<? extends Number> list){
        System.out.println("hello WIld Card entry");
    }

    private boolean isFull(){
        return size == arr.length;
    }

    /**
     * Here,
     * arr.length + 1 brings up Time complexity of O(n)^2 -- Very Bad
     * arr.length * 2 brings up Time complexity of O(n)   -- Good
     */
    private void resize() {
        Object [] temp = new Object[arr.length+1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public CustomGenericArrayListWithExtends() {
        DEFAULT_SIZE = 5;
        arr = new Object[DEFAULT_SIZE];
    }

    public CustomGenericArrayListWithExtends(int DEFAULT_SIZE) {
        CustomGenericArrayListWithExtends.DEFAULT_SIZE = DEFAULT_SIZE;
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if(isFull()){
            resize();
        }
        this.arr[size++] = value;
    }

    public T remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Array is EMPTY");
        }
        T removedValue = (T) arr[--size];
        arr[size] = null;
        return removedValue;
    }

    public void remove(int index) {
        if (arr.length > index) {
            arr[index] = null;
        } else {
            throw new IndexOutOfBoundsException("Array Size is less than Index: " + index);
        }
    }

    public T get(int index) {
        return (T) arr[index-1];
    }

    public int size() {
        return arr.length;
    }

    public void set(int index, T val) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
        arr[index]  = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public void getList(List<Number> list){
        System.out.println(Collections.singletonList(list));
    }


}
