package com.green.day17.ch7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
        buyer.buy(new Computer2());       //0
        buyer.buy(new Tv2());       //0
        buyer.buy(new Tv2());       //0


        buyer.summary(); //총 구매금액: 1000만원
    }
}

class PolyArgumentTestVer2_4{
    public static void main(String[] args) {
        Buyer3 buyer = new Buyer3();
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.summary();
    }
}

class Buyer2 {
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 여러개 저장 가능
    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    private int i;
    private String[] productNames;
    private int[] productCnts;

    public Buyer2() {
        productNames = new String[]{ "Tv" , "Computer" , "Audio"};
        productCnts = new int[productNames.length];
        this.money = 3500;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }

    public void buy(Product2 p) {
        if(p == null) {
            System.out.println("잘못 구매하셨습니다.");
            return;
        }
        if(i == productArr.length) {
            System.out.println("담을 수 있는 공간이 없습니다.");
            return;
        }
        if(money < p.getPrice()) {
            System.out.println("금액이 부족합니다.");
            return;
        }

        productArr[i++] = p;
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();

        int idx = getType(p);
        productCnts[idx]++;
        System.out.printf("%s을(를) 구매하였습니다.\n", p.getName());
    }
    private int getType(Product2 p) {
        for(int i=0; i<productNames.length; i++) {
            if(p.getName().equals(productNames[i])) {
                return i;
            }
        }
        return -1;
    }
    public void summary() {
        int sum = 0;
        for(Product2 p : productArr) {
            if(p == null) { break; }
            sum += p.getPrice();
        }
        System.out.printf("총 구매금액: %,d, 남은금액: %,d, 보너스 포인트: %,d\n"
                , sum, money, bonusPoint);
        /*
        System.out.printf("%s: %d대", productNames[0], productCnts[0]);
        for(int i=1; i<productNames.length; i++) {
            System.out.printf(", %s: %d대", productNames[i], productCnts[i]);
        }
         */
        int commaIdx = 0;
        for(int i=0; i<productNames.length; i++) {
            if(productCnts[i] > 0) {
                if(commaIdx != 0) {
                    System.out.print(", ");
                }
                commaIdx++;
                System.out.printf("%s: %,d대"
                        , productNames[i], productCnts[i]);
            }
        }
        System.out.println("를 구매하였습니다.");
    }
}


class Buyer3 {
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 여러개 저장 가능
    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    private int i;
    private Map<String, Integer> buyItems;

    public Buyer3() {
        buyItems = new HashMap();
        this.money = 3500;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }

    public void buy(Product2 p) {
        if(p == null) {
            System.out.println("잘못 구매하셨습니다.");
            return;
        }
        if(i == productArr.length) {
            System.out.println("담을 수 있는 공간이 없습니다.");
            return;
        }
        if(money < p.getPrice()) {
            System.out.println("금액이 부족합니다.");
            return;
        }

        productArr[i++] = p;
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();

        String productName = p.getName();
        if(buyItems.containsKey(productName)) {
            buyItems.put(productName
                    , buyItems.get(productName) + 1);
        } else {
            buyItems.put(productName, 1);
        }
        System.out.printf("%s을(를) 구매하였습니다.\n"
                , productName);
    }

    public void summary() {
        int sum = 0;
        for(Product2 p : productArr) {
            if(p == null) { break; }
            sum += p.getPrice();
        }
        System.out.printf("총 구매금액: %,d, 남은금액: %,d, 보너스 포인트: %,d\n"
                , sum, money, bonusPoint);

        Set<String> namesSet = buyItems.keySet();
        Iterator<String> iterator = namesSet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            int cnt = buyItems.get(key);
            System.out.printf(" %s: %d대", key, cnt);
        }
        System.out.println("를 구매하였습니다.");
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
