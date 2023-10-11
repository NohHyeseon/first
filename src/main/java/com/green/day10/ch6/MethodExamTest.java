package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10); //0이 아닙니다.
        me.checkZero(9); //0이 아닙니다.
        me.checkZero(0); //0입니다.

        for(int i=0; i<10000; i++) {
            int r = me.randomValFromTo(10, 100); //10~100 랜덤값 리턴 되도록
            System.out.println("r : " + r);
            if(r < 10 || r > 100) {
                System.out.println("잘못된 값!!!!");
                break;
           }
        }

        int r2 = me.randomValFromTo(5, 9); //5~9 랜덤값 리턴 되도록


        me.scoreResultPrint(101); //잘못된 점수입니다.
        me.scoreResultPrint(100); //A학점
        me.scoreResultPrint(90); //A학점
        me.scoreResultPrint(89); //B학점
        me.scoreResultPrint(80); //B학점
        me.scoreResultPrint(79); //C학점
        me.scoreResultPrint(69); //D학점 (69점 이하는 전부 D학점)
        me.scoreResultPrint(-1); //잘못된 점수입니다.
    }
}
