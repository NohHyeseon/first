package com.green.day1;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;

        int temp = y;
        y = x;
        x = temp;
        //리터럴 금지

        //밑에 코드 수정 금지
        System.out.println("x : " + x); //20
        System.out.println("y : " + y); //10
    }
}
