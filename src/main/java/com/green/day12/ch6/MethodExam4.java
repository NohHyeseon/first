package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {

    int[] plusMap(int[] arr, int val) {
        int[] temp = new int[??];

        return temp;
    }
    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = { 10, 20, 30 };
        int[] rArr1 = me4.plusMap(arr, 2);
        System.out.println(Arrays.toString(arr)); // [ 10, 20, 30 ]
        System.out.println(Arrays.toString(rArr1)); // [ 12, 22, 32 ]
    }

}
