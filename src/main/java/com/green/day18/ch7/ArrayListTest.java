package com.green.day18.ch7;


import com.green.day12.ch6.Card;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(13L);
        list.add("dddd");
        list.add(new Card());

        Object val1 = list.get(0);
        int intVal = (int)val1;

        float floatVal = (float)list.get(1);

        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new Card();

    }
}

class ArrayListTest2 {
    public static void main(String[] args) {
        int v1 = 10;
        Integer v2 = 10;
        System.out.println(v1 == v2);
        List<Integer> list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(34);
        list.add(45);
        //list.add(10.3f);
        //list.add(10.3d);
        //list.add("ddd");
        int val1 = list.get(0);
        System.out.println(list.get(1));

        System.out.println("size : " + list.size());
        System.out.println("--------------");
        for(int i=0; i<list.size(); i++) {
            System.out.printf("[%d]: %d\n", i, list.get(i));
        }
        System.out.println("--------------");
        for(int val : list) {
            System.out.println(val);
        }
        // [0]: 10
        // [1]: 20
        // [2]: 30
        // [3]: 45
    }
}

class ArrayListTest3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("1: " + list);
        list.add(1, 100);
        System.out.println("2: " + list);
        list.add(3, 200);
        System.out.println("3: " + list);

        list.remove(0);
        System.out.println("4: " + list + ", size : " + list.size());
    }
}
