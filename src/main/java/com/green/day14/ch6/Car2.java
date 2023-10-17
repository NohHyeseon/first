package com.green.day14.ch6;

public class Car2 {
    String color = "dddd";
    String gearType;
    int door;
    {
        color = "gggg";
    }
    public void printMySelf() {
        System.out.printf("color=%s, gearType=%s, door=%d\n", color, gearType, door);
    }

    public Car2() {

    }

    public Car2(String color) {
        this.color = color;
    }

    public Car2(Car2 car2) {
        color = car2.color;
        gearType = car2.gearType;
        door = car2.door;
    }
}

class Car2Test {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        Car2 c1 = new Car2();
        c1.color = "black";
        c1.gearType = "manual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);
        c2.door = 4;

        c1.printMySelf(); //color=black, gearType=manual, door=5
        c2.printMySelf(); //color=black, gearType=manual, door=5
    }
}
