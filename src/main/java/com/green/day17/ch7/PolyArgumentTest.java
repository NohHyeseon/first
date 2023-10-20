package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPrice = c.getBonusPoint();

        Tv tv = new Tv();
        int tvPrice = tv.getPrice(); //100
        int tvBonusPrice = tv.getBonusPoint(); //10
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); //money: 1000, bonusPoint: 0
        buyer.buy(new Tv()); //price: 100
        buyer.buy(new Tv()); //price: 100
        buyer.buy(new Computer());//price: 200
        buyer.buy(new Computer());//price: 200
        buyer.buy(new Computer());//price: 200
        buyer.buy(new Computer());//price: 200
        buyer.buy(new Computer());//price: 200
        buyer.buy(new Tv()); //price: 100
        System.out.println(buyer); //money: 750, bonusPoint: 30

        //buyer money가 부족하면 "잔액 부족" money값 마이너스 처리 X
        //잔액이 부족하지 않으면 Tv을/를 구입하셨습니다.
        // > money 차감 처리, bonusPoint 플러스 처리
    }
}
class Buyer {
    public void buy(Product product) {
        if(money < product.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        //money = money - product.getPrice();
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        System.out.printf("%s을/를 구매하셨습니다.\n", product);
    }

    private int money;
    private int bonusPoint;

    public Buyer() {
        this.money = 1050;
        this.bonusPoint = 0;
    }




    @Override
    public String toString() {
        return String.format("money: %d, bonusPoint: %d", money, bonusPoint);
    }

}

class Product {
    private int price;
    private int bonusPoint;
    protected Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
    }

    public int getPrice() { return price; }
    public int getBonusPoint() { return bonusPoint; }

    @Override
    public String toString() {
        return String.format("price: %d, bonusPoint: %d"
                , price, bonusPoint);
    }
}

class Tv extends Product {
    public Tv() {
        super(100);
    }

    @Override
    public String toString() {
        //return "Tv, " + super.toString();
        return "Tv";
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
    }
    @Override
    public String toString() {
        //return String.format("Computer, %s", super.toString());
        return "Computer";
    }
}