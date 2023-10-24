package com.green.day19.ch7;

class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}

public abstract class Player {
    public abstract void play(int pos);
}

class AudioPlayer extends Player {
    @Override
    public void play(int pos) {
        System.out.println("Audio Play 위치 : " + pos);
    }
}

class VideoPlayer extends Player {
    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 : " + pos);
    }
}

abstract class DvdPlayer extends Player {

}
