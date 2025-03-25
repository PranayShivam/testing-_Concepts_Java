package com.edu.Oops_Concepts.PART_5.Interfaces;

public class Car implements Engine, Brake, MediaPlayer{

    @Override
    public void brake() {
        System.out.println("Apply Brake");
    }

    @Override
    public void start() {
        System.out.println("Start Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");

    }

    @Override
    public void play() {
        System.out.println("Play Music");
    }

    @Override
    public void pause() {
        System.out.println("Pause Music");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate");
    }
}
