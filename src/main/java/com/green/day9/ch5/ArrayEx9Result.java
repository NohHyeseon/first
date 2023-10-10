package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx9Result {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11, 9 };
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            int rIdx = (int)(Math.random() * code.length); //0~5
            arr[i] = code[rIdx];
        }

        /*
        arr각 방에 code에 있는 값만 랜덤하게 넣어주세요.
         */

        System.out.println(Arrays.toString(arr));
    }
}
