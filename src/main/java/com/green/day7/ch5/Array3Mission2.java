package com.green.day7.ch5;

public class Array3Mission2 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 10, 15, 20, 30, 40, 50, 60 };
        int[] arr2 = new int[arr1.length + 8];

        System.out.println(arr1[arr1.length - 1]);

        for(int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
        }


        arr2[arr2.length - 1] = 20;

        for(int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }

        //arr2는 arr1보다 1 더 큰 배열을 만든다. arr1과 같은 방은 같은 값을 가지고 있고
        //마지막 방은 20을 갖고 있는 배열을 만들어 주세요.

    }
}
