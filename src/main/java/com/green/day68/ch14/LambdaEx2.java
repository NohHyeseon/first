package com.green.day68.ch14;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 mf = () -> System.out.println("안녕");
        mf.myMethod();
    }
}
