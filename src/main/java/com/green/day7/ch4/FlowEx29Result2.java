package com.green.day7.ch4;

public class FlowEx29Result2 {
    public static void main(String[] args) {

        for(int i=1; i<101; i++) {
            System.out.printf("i=%d ", i);
            int temp = i;
            do {
                int modVal = temp % 10;
                if(modVal != 0 && modVal % 3 == 0) {
                    System.out.print("짝");
                }
                temp /= 10;
            } while(temp != 0);
            System.out.println();
        }
    }
}
