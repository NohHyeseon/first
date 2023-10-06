package com.green.day7.ch4;

public class FlowEx29Result {
    public static void main(String[] args) {


        for(int i=1; i<101; i++) {
            System.out.printf("i=%d", i);
            int tmp = i;
            do {
                if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
                    System.out.print("짝");
                }
            } while((tmp/=10) != 0); // tmp = 3
            System.out.println();
        }
    }
}
