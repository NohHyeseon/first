package com.green.day15.ch7;

class Tv {
    public Tv() {
        System.out.println("나 Tv야");
    }
    boolean power;
    int channel;
    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
}

class CaptionTv extends Tv {

    public CaptionTv() {
        System.out.println("나 CaptionTv야");
    }

    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }

    @Override
    void channelUp() {
        channel += 5;
    }
}

class CaptionTvTest3 {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.println(cTv);
        System.out.printf("cTv.power : %b\n", cTv.power);//false
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);//true
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);//false
        cTv.channel = 10;
        cTv.channelUp();
        System.out.printf("cTv.channel : %d\n", cTv.channel); //11
        cTv.displayCaption("반갑다 친구들!!!");
        cTv.caption = true;
        cTv.displayCaption("jjkjm,jjkjkjkjkj");
    }
}
