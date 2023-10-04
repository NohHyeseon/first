package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int line = scan.nextInt();

        int idx = 1;
        int returnVal = 1;
        for(int i=1; i<=line * line; i++) {
            if(idx++ <= returnVal) {
                System.out.print("*");
            } else {
                System.out.print("");
            }
            if(i % line == 0) {
                returnVal++;
                idx = 1;
                System.out.println();
            }
        }
    }
}
