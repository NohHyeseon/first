package com.green.day7.ch4;

public class FlowEx30Result2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int target = 100;
        // i 값이 계속 증가가되면 sum에 중첩으로 더하기
        // sum값이 100초과가 되는 시점의 i값

        while (sum < target) {
            sum += ++i;
            System.out.printf("%d, %d\n", sum,i);
        }
        System.out.println("100초과된 i값 = "+i);
    }
}
