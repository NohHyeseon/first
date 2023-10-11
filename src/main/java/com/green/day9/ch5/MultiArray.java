package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 100, 200 },
                { 300, 400, 450, 470, 480 },
                { 500, 600 },
                { 10 }
        };

        for(int i=0; i<arr.length; i++) {
            int[] subArr = arr[i];

            for(int z=0; z<subArr.length; z++) {
                System.out.printf("arr[%d][%d] : %d\n", i, z, subArr[z]);
            }
        }



        System.out.println("arr.length : " + arr.length); //4
        System.out.println(arr[0].length); //2,
        System.out.println(arr[1].length); //3
        System.out.println(arr[2].length); //2
        System.out.println("arr[1][2] : " + arr[1][2]);
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

        System.out.println("-------");
        int[] intArr = arr[0];
        System.out.println("intArr.length : " + intArr.length);
        System.out.println(intArr[1]);

        System.out.println("------=");
        System.out.println("arr.length : " + arr.length);
        System.out.println("arr[0].length : " + arr[0].length);
    }
}
