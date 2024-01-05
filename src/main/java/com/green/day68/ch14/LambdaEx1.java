package com.green.day68.ch14;

@FunctionalInterface
interface MyFunction {
    void run(int n1, int n2);
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf0 = (i, i2) -> { System.out.println("mf0 - run !!"); };

        MyFunction mf1 = new MyFunction() {
            public void run(int i, int i2) {
                System.out.println("mf1 - run !! ");
            }
        };

        MyFunction mf2 = new MyFunctionClass();

        mf0.run(1, 2);
        mf1.run(1, 2);
        mf2.run(1, 2);
    }
}

class MyFunctionClass implements MyFunction {
    public void run(int a, int b) {
        System.out.println("class name - run !! ");
    }
}


