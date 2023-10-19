package com.green.day13.ch6;

public class MyMath2  {
    int num;
    public static int staticNum;

    void instanceAbs() {
        System.out.println(num < 0 ? -num : num);
    }

    public static void staticAbs(int n) {
        System.out.println(n < 0 ? -n : n);
    }

    static void print() {
        System.out.printf("staticNum : %d\n", staticNum);
    }

    void print2() {
        print();
        System.out.printf("staticNum : %d, num : %d\n", staticNum, num);
    }
}
