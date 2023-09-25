package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4Result2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        char grade = 'D';
        if(score >= 90) {
          grade = 'A';
        } else if(score >= 80) {
          grade = 'B';
        } else if(score >= 70) {
          grade = 'C';
        }
        System.out.printf("%c학점\n", grade);
        System.out.println("-- 끝 --");

    }
}
