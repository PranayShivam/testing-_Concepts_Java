package com.edu.Oops_Concepts.PART_5.Interfaces;

public interface Engine {

    /**
     * In Interfaces, variables are by default static and final
     * we don't need to manually declare them
     *     static final int price = 10000;
     */
    int PRICE = 10000;

    void start();
    void stop();
    void accelerate();

}
