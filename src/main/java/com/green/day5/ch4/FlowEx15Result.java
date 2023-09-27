package com.green.day5.ch4;

public class FlowEx15Result {
    public static void main(String[] args) {
        final int DAN = 2;

        for(int i=1; i<10; i++) {
            System.out.printf("%d X %d = %d\n", DAN, i, DAN * i);
        }
        /*
        반복문 사용
        6 x 1 = 6
        6 x 2 = 12
        6 x 3 = 18
        ...
        6 x 9 = 54

         */
    }
}
