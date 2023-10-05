package com.green.day6.ch4;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int)(Math.random() * 100) + 1; //1~100
        System.out.println("answer : " + answer);
        /*
        1~100 사이의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > "Up"
        입력한 숫자보다 정답이 작다 > "Down"
        맞출때까지 반복한다.
         */
        System.out.println("끝!!");
    }
}
