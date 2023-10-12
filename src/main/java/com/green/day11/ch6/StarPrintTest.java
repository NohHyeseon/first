package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        for(int i=0; i<5; i++) {
            sp.line(5); //*****(개행)
        }
        sp.line(7); //*******(개행)
        System.out.println("----");
        sp.square(10);
        //****
        //****
        //****
        //****

        sp.triangle(3);
        //*     line(1)
        //**    line(2)
        //***   line(3)
        //****  line(4)
        //***** line(5)

        String gender = sp.chkGenderById("011231-5117111");
        System.out.println("gender : " + gender);
        /*
        8번째 자리의 숫자가
        2, 4이면 > 여성
        1, 3이면 > 남성
        이외의 값이면  > 유효하지않은 주민번호
         */

        int sum = sp.sumFromTo(4, 10);
        System.out.println("sum : " + sum);
        int sum2 = sp.sumFromTo(10, 15);
        System.out.println("sum2 : " + sum2);
    }
}
