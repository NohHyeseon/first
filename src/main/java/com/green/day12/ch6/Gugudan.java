package com.green.day12.ch6;

public class Gugudan {
    void print(int dan) {
        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }

    void printFromTo(int min, int max) {
        for(int i=min; i<=max; i++) {
            print(i);
        }
    }

    void printFromTo(int min, int max, String sep) {
        for(int i=min; i<=max; i++) {
            print(i);
            System.out.println(sep);
        }
    }
}
