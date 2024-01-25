package com.green.day83;

import com.green.day8.ch5.ArrayToStringMission;

import java.util.ArrayList;
import java.util.List;

public class GboxTest {
    public static void main(String[] args) {
        Gbox g1 = new Gbox();
        g1.selItem(1);
        g1.selItem("오오오");

        Gbox<Integer> g2 = new Gbox<>();//컴파일 하는 시점에 타입결정
        //이순간 문자열 X 무조건 Integer만 가능
        g2.selItem(1);
        g2.selItem(2);

        int intVal = g2.getItem();

        Gbox<String>g3 = new Gbox<>();
        g3.selItem("하하하");
        String strVal = g3.getItem();

        List<Integer> list = new ArrayList<>();
        list.add(1);
    }
}
