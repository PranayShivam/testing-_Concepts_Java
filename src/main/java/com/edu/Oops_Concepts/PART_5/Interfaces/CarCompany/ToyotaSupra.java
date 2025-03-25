package com.edu.Oops_Concepts.PART_5.Interfaces.CarCompany;

import com.edu.Oops_Concepts.PART_5.Interfaces.*;

public class ToyotaSupra {

    private Engine engine;
    private MediaPlayer player = new CDPlayer();

    public ToyotaSupra() {
        engine = new PowerEngine();
    }

    public ToyotaSupra(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeToElectricEngine() {
        this.engine = new ElectricEngine();
    }

}
