package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요 >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        //double num = Double.parseDouble(input);

        System.out.println("입력내용: " + (input + input));
        System.out.printf("num=%d\n", (num + num));
    }
}
