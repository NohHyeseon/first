package com.green.day7.ch4;

//p.178
public class BreakContinue3 {
    public static void main(String[] args) {
        abc:
        for(int i=0; i<5; i++) {
            for(int z=10; z<15; z++) {
                if(z == 13) { break abc; }
                System.out.printf("i:%d - z:%d\n", i, z);
            }
        }
        System.out.println("-------------");

        def:
        for(int i=0; i<5; i++) {
            for(int z=10; z<15; z++) {
                if(z == 13) { continue def; }
                System.out.printf("i:%d - z:%d\n", i, z);
            }
        }
        System.out.println("-------------");


        for(int i=0; i<5; i++) {
            for(int z=10; z<15; z++) {
                if(z == 13) { break; }
                System.out.printf("i:%d - z:%d\n", i, z);
            }
        }
    }
}
