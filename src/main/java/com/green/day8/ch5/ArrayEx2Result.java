package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2Result {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }

        System.out.println(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));

        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
        각 방의 값이 모두 같으면 안 됩니다.
        (중복 허용)
        */
    }
}
