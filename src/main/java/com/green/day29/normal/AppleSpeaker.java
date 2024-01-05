package com.green.day29.normal;

public class AppleSpeaker {
    private HansungWoofer woofer;

    public AppleSpeaker() {
        woofer = new HansungWoofer();
    }

    public void sound() {
        System.out.println("애플 스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}
