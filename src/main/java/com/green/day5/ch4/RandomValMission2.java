package com.green.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        final int MIN = 15, MAX = 18;


        // MIN, MAX 상수만 사용하여
        // MIN ~ MAX 나올 수 있는 랜덤 숫자를 만드는 로직을 구현하시오.

        for(int i=0; i<1000; i++) {
            int val = (int)(Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println(val);
            if(val < MIN || val > MAX) {
                System.out.println("범위를 벗어났습니다.");
                break;
            }
        }
        System.out.println("끝!!!");
    }
}
