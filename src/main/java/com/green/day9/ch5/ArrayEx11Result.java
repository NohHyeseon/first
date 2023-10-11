package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11Result {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for(int i=0; i<LEN; i++) {
            int rVal = (int)(Math.random() * LEN); //0~9
            numArr[i] = rVal;
        }
        System.out.println(Arrays.toString(numArr));

        /*
        for(int i=0; i<LEN; i++) {
            int val = numArr[i];
            cntArr[val]++;
        }
        */
        for(int n : numArr) {
            cntArr[n]++;
        }

        System.out.println(Arrays.toString(cntArr));
        /*
        numArr 각 방에 0~9사이의 랜덤값을 대입한다 (중복 허용)
        numArr 각 방의 값도 출력
        cntArr의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        0~9의 개수를 출력
        [4, 4, 4, 6, 5, 7, 9, 7, 5, 3]
        0의 개수: 0
        1의 개수: 0
        2의 개수: 0
        3의 개수: 1
        4의 개수: 3
        5의 개수: 2
        6의 개수: 1
        7의 개수: 2
        8의 개수: 0
        9의 개수: 1
         */
    }
}
