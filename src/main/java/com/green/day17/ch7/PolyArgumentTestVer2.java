package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);
    }
}

class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv); //name: Tv, price: 100, bonusPoint: 10
        Computer2 com = new Computer2();
        System.out.println(com); //name: Computer, price: 200, bonusPoint: 20
        Audio2 audio = new Audio2();
        System.out.println(audio); //name: Audio, price: 500, bonusPoint: 50
    }
}

class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());       //0
        buyer.buy(new Computer2()); //1
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2
        buyer.buy(new Audio2());    //2

        Product2[] arr = buyer.productArr;
        for(int i=0; i<arr.length; i++) {
            Product2 p = arr[i];
            System.out.printf("arr[%d] : %s\n", i, p);
        }
    }
}

class Buyer2 {
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 여러개 저장 가능
    private int money;
    private int bonusPoint;
    Product2[] productArr;
    private int i;

    public Buyer2() {
        this.money = 1000;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }

    public void buy(Product2 p) {
        productArr[i++] = p;
    }
}

class Audio2 extends Product2 {
    public Audio2() {
        super("Audio", 500);
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super("Computer", 200);
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super("Tv", 100);
    }
}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %d, bonusPoint: %d", name, price, bonusPoint);
    }
}
