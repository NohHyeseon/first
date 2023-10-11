package com.green.day10.ch5;

import java.util.Scanner;

//p.227
public class MultiArrEx4Result2 {
    public static void main(String[] args) {
        String[][] words = {
                  { "chair", "의자" }
                , { "computer", "컴퓨터" }
                , { "integer", "정수" }
                , { "double", "실수" }
        };

        Scanner scan = new Scanner(System.in);
        int i = 1;
        for(String[] wordArr : words) {
            System.out.printf("Q%d. %s의 뜻은? >> ", i++, wordArr[0]);
            String answer = scan.nextLine();

            String expectedAnswer = wordArr[1];
            if(!answer.equals(expectedAnswer)) {
                System.out.printf("오답입니다. 정답은 %s입니다.\n", expectedAnswer);
                continue;
            }
            System.out.println("정답입니다.");
        }
        System.out.println("끝!!");
        /*
        Q1. chair의 뜻은? >> dmlwk
        틀렸습니다. 정답은 의자입니다.

        Q2. computer의 뜻은? >> 컴퓨터
        정답입니다.

        Q3. integer의 뜻은? >> 정주
        틀렸습니다. 정답은 정수입니다.
         */
    }
}
