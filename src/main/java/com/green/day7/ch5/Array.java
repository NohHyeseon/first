package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;
        int[] arr = { 10, 20, 30, 40, 50 };
        String[] arr2 = {  "A", "B", "가가", "나나" };

        int[] arr3 = new int[30]; //각 방에는 0이 들어가있음.
        int arr4[] = new int[30];

        arr[0] = 200;

        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr[1]: " + arr[1]);
        System.out.println("arr[2]: " + arr[2]);
        System.out.println("arr[3]: " + arr[3]);

        System.out.println("arr.length : " + arr.length);

    }
}
