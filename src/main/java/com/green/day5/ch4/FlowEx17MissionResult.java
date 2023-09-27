package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17MissionResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int line = scan.nextInt();

        for(int i=1; i<=line; i++) {
            for(int z=line-i; z>0; z--) {
                System.out.print("_");
            }
            for(int z=0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }






        System.out.println("-----------------");
        for(int i=line; i>0; i--) {
            for(int z=1; z<=line; z++) {
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------");
        for(int i=line; i>0; i--) {
            for(int z=1; z<=line; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }

        //5 입력
        /*
        ____*
        ___**
        __***
        _****
        *****

         */
    }
}
