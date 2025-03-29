package com.edu.Oops_Concepts.PART_6.CustomArrysAndGenerics;

import java.util.Arrays;

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
public class CustomArrayList {

    private int[] arr;
    private static final int DEFAULT_SIZE = 5;
    private int size = 0;

    private boolean isFull(){
        return size == arr.length;
    }

    private void resize() {
        int [] temp = new int[arr.length*2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public CustomArrayList() {
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int value) {
        if(isFull()){
            resize();
        }
        this.arr[size++] = value;
    }

    public int remove() {
        return arr[--size];
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return arr.length;
    }

    public void set(int index, int val) {
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
}
