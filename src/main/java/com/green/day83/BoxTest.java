package com.green.day83;

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.selItem(1);
        int inVal = (int)b1.getItem();
        System.out.println("inVal : "+ inVal);
        b1.selItem("아아아");
        String strVal = (String) b1.getItem();
        System.out.println("str1 : "+strVal);

        Box b2 = new Box();
        b2.selItem("안녕");
        String stVal = (String)b2.getItem();

    }
}
