package com.green.day16.ch7;



class AnimalTest {
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new Bulldog();
        Animal ani1 = new Bulldog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        //2. 자식타입은 부모 객체 주소값 담을 수 없다.
        //Bulldog bull1 = new Dog();
        Dog d2 = new Dog();
        //Bulldog bull2 = (Bulldog)d2;
        Animal ani4 = d2;
        System.out.println("끝");

        //3. 타입은 알고 있는 메소드만 호출할 수 있고
        // , 호출이 된다면 객체 기준이다.
        Bulldog bull3 = new Bulldog();
        bull3.jump();
        bull3.crying();

        Dog dog2 = new Bulldog();
        //dog2.jump();
        dog2.crying();

    }
}

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}

class Bulldog extends Dog {

    public void jump() {
        System.out.println("불독이 점프! 점프!");
    }

    @Override
    public void crying() {
        System.out.println("불독이 왈! 왈!");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹~ 야옹~");
    }
}
