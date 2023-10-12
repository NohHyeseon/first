package com.green.day10.ch6;

public class Tv {
    //멤버필드, 속성, property, 전역변수
    String color;    //0, null
    boolean power;  //0, false
    int channel;    //0, 0


    //멤버메소드, 메소드
    //리턴타입 메소드명 파라미터
    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
}
