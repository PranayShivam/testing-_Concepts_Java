package com.edu.Oops_Concepts.PART_5.Interfaces.CarCompany;

import com.edu.Oops_Concepts.PART_5.Interfaces.Engine;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Power Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate Power Engine");
    }
}
