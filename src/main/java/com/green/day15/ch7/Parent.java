package com.green.day15.ch7;

public class Parent {
    int age;

    Parent(int age) {
       this.age = age;
    }
}
class Child extends Parent {

    public Child() {
        super(30);
    }
    void play() {
        System.out.printf("나는 %d살이야 같이 놀자~", age);
    }
}

class GrandChild extends Child {


    void whatPlay() {
        play();
        super.play();
    }
}

class Child2 extends Parent {

    public Child2() {
        super(10);
    }
    void jump() {
        System.out.printf("%d살의 아이가 점프를 하였다.", age);
    }
}
class Main2 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.whatPlay();
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Child2 c2 = new Child2();
        c2.age = 7;
        c2.jump();
    }
}
