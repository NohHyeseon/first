package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4Result {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if(score >= 90) {
            System.out.println("A학점");
        } else if(score >= 80) {
            System.out.println("B학점");
        } else if(score >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");
        }
        System.out.println("-- 끝 --");

    }
}
