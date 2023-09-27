package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        //첫번째: 초기화 공간
        //두번째: 반복여부 체크
        //세번째: 증감식

        for(int i=50; i>0; i--) {
            System.out.println("안녕");
        }
        System.out.println("-- 끝 --");


        int j=0;
        for( ; j<10; ) {
            System.out.println("j : " + (++j));
        }
    }
}
