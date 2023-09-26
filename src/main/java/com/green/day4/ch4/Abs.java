package com.green.day4.ch4;

public class Abs {
    public static void main(String[] args) {
        int num = 116;

        System.out.printf("%d는(은) 절대값 %d\n", num, Math.abs(num));
        //10는(은) 절대값 10
        //-9는(은) 절대값 9
        //-6는(은) 절대값 6

        System.out.println("-------------------- (A)");
        if(num < 0) { //음수
            System.out.printf("(1)%d는(은) 절대값 %d\n", num, -num);
        } else { //양수
            System.out.printf("(2)%d는(은) 절대값 %d\n", num, num);
        }

        System.out.println("-------------------- (B)");
        System.out.printf("(3)%d는(은) 절대값 %d\n"
                , num, num < 0 ? -num : num);

        System.out.println("-------------------- (C)");
        int result = num < 0 ? -num : num;
        System.out.printf("(4)%d는(은) 절대값 %d\n", num, result);
    }
}
