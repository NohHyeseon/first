package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
        //while은 반복문입니다.

        for(int i=0; i<10; ++i) {
            System.out.println("for-" + i);
        }

        System.out.println("----------");
        int i=0;
        while(i<10) {
            System.out.println("while-" + i++);

        }
    }
}
