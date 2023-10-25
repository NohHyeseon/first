package com.green.extra.ch4;

import java.util.Scanner;

public class FlowEx1Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");
        String input = scan.nextLine();
        try {
            int intInput = Integer.parseInt(input);
            System.out.printf("%d는(은) %s수입니다.\n"
                    , intInput, intInput % 2 == 0 ? "짝" : "홀");
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}

class FlowEx1Result2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");
        String input = scan.nextLine();
        int intVal = 0;
        try {
            intVal = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.printf("%d는(은) %s수입니다.\n"
                , intVal, intVal % 2 == 0 ? "짝" : "홀");
    }
}
