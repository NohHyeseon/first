package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd");
        //`Tv tv3 = str;

        Tv tv1 = new Tv();
        tv1.channel = 10;
        tv1.color = "빨간색";

        Tv tv2 = new Tv();


        System.out.println("tv1 == tv2 >> " + (tv1 == tv2));

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.power : " + tv1.power);
        System.out.println("tv1.color : " + tv1.color);

        System.out.println("---------------");
        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.power : " + tv2.power);
        System.out.println("tv2.color : " + tv2.color);
    }
}
