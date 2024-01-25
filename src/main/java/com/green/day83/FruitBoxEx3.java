package com.green.day83;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBoxlist =new FruitBox();
        fruitBoxlist.add(new Apple());
        fruitBoxlist.add(new Apple());
        fruitBoxlist.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitBoxlist);
        System.out.println(j1);

        FruitBox<Apple> appleFruitBoxlist =new FruitBox();
        appleFruitBoxlist.add(new Apple());
        appleFruitBoxlist.add(new Apple());
        //appleFruitBoxlist.add(new Grape());
        Juice j2 = Juicer.makeJuice(appleFruitBoxlist);
        System.out.println(j2);


        /*FruitBox<Toy> toyFruitBox =new FruitBox();
        toyFruitBox.add(new Toy());
        Juice j2 = Juicer.makeJuice(toyFruitBox);*/

    }
}

class Juice {
    private String name;

    Juice(String name){
        this.name = name +"Juice";
    }
    public String toString(){
        return this.name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box){ //? : 와일드카드
        String temp = "";
        for (Fruit f: box.getList()) {
            temp += f + " ";
        }
        return new Juice(temp);
    }
}