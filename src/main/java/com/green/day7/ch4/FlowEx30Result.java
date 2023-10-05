package com.green.day7.ch4;

public class FlowEx30Result {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        final int TARGET = 500;

        while(sum < TARGET) {
            System.out.printf("sum: %d\n", sum);
            sum += ++i;
            System.out.printf("sum: %d, i: %d\n", sum, i);
        }
        System.out.println("i: " + i);
    }
}
