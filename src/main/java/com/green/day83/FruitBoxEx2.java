package com.green.day83;

import com.green.day7.ch5.Array;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitFruitBox = new FruitBox();
        FruitBox<Apple> fruitFruitBox2 = new FruitBox();
        FruitBox<Grape> fruitFruitBox3 = new FruitBox();


//        FruitBox<Toy> toyFruitBox = new FruitBox();
    }
}

class FruitBox<T extends Fruit> extends GBoxList<T>{
    List<T> getList(){
        return list;
    }
}
