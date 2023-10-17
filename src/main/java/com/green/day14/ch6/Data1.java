package com.green.day14.ch6;

public class Data1 {
    int value;
    int value2;
    int value3;

    public Data1() {
        //value = 100;
        //value2 = 200;
        //value3 = 300;
        this(200, 300, 400);
    }

    public Data1(int a) {
        value = a;
    }

    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf() {
        System.out.printf("value: %d, value2: %d, value3: %d\n"
                , value, value2, value3);
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        data1.printMySelf();

        Data1 data1_2 = new Data1(10, 20, 30);
        data1_2.printMySelf();

    }
}
