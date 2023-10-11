package com.green.day10.ch6;

public class ReturnNumberBox {
    int sum(int n1, int n2) {
        return n1 + n2;
    }

    int abs(int n) {
        int result = n;
        if(result < 0) {
            result = -result;
        }
        return result;
    }

    int abs2(int n) {
        if(n < 0) {
            return -n;   // n * -1
        }
        return n;
    }

    int abs3(int n) {
        return n < 0 ? -n : n;
    }

}
