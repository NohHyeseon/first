package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'F';

        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 점수를 입력하세요.(1~100) >>");
        String tmp = scan.nextLine();
        score = Integer.parseInt(tmp);

        //switch를 사용
        //90점 이상은 "당신의 학점은 A입니다.
        //80점 이상은 "당신의 학점은 B입니다.
        //70점 이상은 "당신의 학점은 C입니다.
        //나머지는 "당신의 학점은 F입니다.

    }
}


