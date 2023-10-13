package com.green.day10.ch6;

public class NumberBox {
    void abs(int n) {
        System.out.println(n < 0 ? -n : n);
    }


    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
        return;
    }

    void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }
}
