package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for(int i=0; i<10; i++) {
            list.add(i + 10);
        }
        for(Integer val : list) {
            System.out.println(val);
        }
        System.out.println("----");
        list.forEach(new MyConsumer<Integer>());
        System.out.println("----");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });
        System.out.println("----");
        list.forEach(i -> System.out.println("MyConsumer(3) : " + i));
        System.out.println("----");
        /*
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer v) {
                return v % 2 == 0;
            }
        });
        */
        list.removeIf(v -> v % 2 == 0 );
        System.out.println(list);
    }
}

class MyConsumer<B> implements Consumer<B> {
    @Override
    public void accept(B o) {
        System.out.println("MyConsumer(1) : " + o);
    }
}
