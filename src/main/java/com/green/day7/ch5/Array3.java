package com.green.day7.ch5;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 15, 20 };
        int[] arr2 = new int[arr1.length];

        System.out.println("----- arr2");
        for(int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }

        for(int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //동등성(equals), 동일성 ( == )

        arr2[1] = 200;
        System.out.println("----- arr1");
        for(int i=0; i<arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
        System.out.println("----- arr2");
        for(int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
    }
}
