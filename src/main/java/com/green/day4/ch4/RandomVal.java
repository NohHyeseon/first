package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random(); //0.000 ~ 0.9999
        System.out.println("doubleVal : " + doubleVal);

        int intVal = (int)(doubleVal * 10);
        System.out.println("intVal : " + intVal);

        int rVal = (int)(Math.random() * 20);
        System.out.println("rVal : " + rVal);
    }
}
