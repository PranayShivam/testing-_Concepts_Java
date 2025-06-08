package com.edu.Oops_Concepts.PART_5.Interfaces.CarCompany;

import com.edu.Oops_Concepts.PART_5.Interfaces.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Electric Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate Electric Engine");
    }
}
