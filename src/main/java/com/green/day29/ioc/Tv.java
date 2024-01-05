package com.green.day29.ioc;

import com.green.day29.Speaker;

public abstract class Tv {
    protected boolean isMute;
    protected Speaker speaker;

    public void toggleMute() {
        isMute = !isMute;
    }

    public void sound() {
        if(!isMute) {
            speaker.sound();
        }
    }
}
