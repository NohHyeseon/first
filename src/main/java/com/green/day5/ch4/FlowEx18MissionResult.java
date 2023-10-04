package com.green.day5.ch4;

public class FlowEx18MissionResult {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {

            for(int z=2; z<10; z++) {
                System.out.printf("%d x %d = %d\t", z, i, z * i);
            }
            System.out.println();
        }
    }
}
