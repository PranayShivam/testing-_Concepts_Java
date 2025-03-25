package com.edu.Oops_Concepts.PART_5.Interfaces.CarCompany;

import com.edu.Oops_Concepts.PART_5.Interfaces.MediaPlayer;

public class CDPlayer implements MediaPlayer {

    @Override
    public void start() {
        System.out.println("Start Music Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music Player");
    }

    @Override
    public void play() {
        System.out.println("Play Music Player");
    }

    @Override
    public void pause() {
        System.out.println("Pause Music Player");
    }
}
