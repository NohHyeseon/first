package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(예:12345) >> ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        while(num != 0) {
            sum += num % 10; //sum = sum + num % 10;
            /*
            int modVal = num % 10;
            sum = sum + modVal;

            num = num / 10;
             */
            num /= 10;
        }
        System.out.println("결과 >> " + sum);
        //12345 >> 15
        //2233 >> 10
        //23 >> 5
    }

}