package com.edu.Oops_Concepts.PART_5.Interfaces;

import com.edu.Oops_Concepts.PART_5.Interfaces.CarCompany.ToyotaSupra;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//
//        Engine engine = new Car();
//        engine.start();
//
//        Brake brake = new Car();
//        brake.brake();
//
//        MediaPlayer mediaPlayer = new Car();
//        mediaPlayer.start();

        ToyotaSupra engine1 = new ToyotaSupra();
        engine1.start();
        engine1.startMusic();
        engine1.upgradeToElectricEngine();
        engine1.start();


    }
}
