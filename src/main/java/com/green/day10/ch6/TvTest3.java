package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = tv1;

        System.out.printf("tv1.channel : %d\n", tv1.channel); //0, 0
        tv1.channelUp();
        tv1.channelUp();
        System.out.printf("tv1.channel : %d\n", tv1.channel); //2, 2
        System.out.printf("tv2.channel : %d\n", tv2.channel); //2, 2
    }
}
