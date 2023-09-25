package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >");

        int val = scan.nextInt();
        if(val == 0) {
            System.out.println("다른 값을 입력해 주세요.");
        } else {
            if(val % 2 == 0) {
                System.out.printf("%d는(은) 짝수입니다.", val);
            } else {
                System.out.printf("%d는(은) 홀수입니다.", val);
            }
        }
    }
}
