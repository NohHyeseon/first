package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox();
        int r1 = rnb.sum(10, 20);
        System.out.printf("%d + %d = %d\n", 10, 20, r1);

        int r2 = rnb.sum(20, 30);
        System.out.printf("%d 더하기 %d = %d\n", 20, 30, r2);

        int r3 = rnb.abs(-10);
        System.out.println("r3 : " + r3); //10

        System.out.println("r4 : " + rnb.abs(10)); //10
        System.out.println("r5 : " + rnb.abs(-99)); //99
        System.out.println("r6 : " + rnb.abs(98)); //98
    }
}
