package com.green.day17.ch7;

public class CarTest {
    public static void main(String[] args) {
        Sonata sonata = new Sonata();
        sonata.printSuperCc();
        sonata.printThiCc();
    }
}

class Car {
    {
        cc = 10;
    }
    int cc;

    public Car() {   }
}

class Sonata extends Car {
    int cc;
    public void printThiCc() {
        System.out.println(this.cc);
    }
    public void printSuperCc() {
        System.out.println(super.cc);
    }
}


