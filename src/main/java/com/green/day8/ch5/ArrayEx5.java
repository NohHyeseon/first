package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100, 100, 90 }; //누군가의 과목 점수

        int sum = 0;
        for(int i=0; i<score.length; i++) {
            sum += score[i];
        }

        float avg = (float)sum / score.length;

        System.out.printf("총점 : %d\n", sum);
        System.out.printf("평점 : %.1f\n", avg);
        //구현!!!
        //총점 점수
        //평균 점수
    }
}
