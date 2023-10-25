package com.green.extra.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        System.out.println(name);

        String title1 = "12" + 10 + 9;
        //String title1 = "12" + "10" + 9;
        //String title1 = "1210" + 9;
        //String title1 = "1210" + "9";
        //String title1 = "12109";
        System.out.println(title1); //12109

        String title2 = "12" + (10 + 9);
        //String title2 = "12" + 19;
        //String title2 = "12" + "19";
        //String title2 = "1219";
        System.out.println(title2); //1219






        String str1 = new String("10");
        String str2 = new String("Hello");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));

        Numbox b1 = new Numbox(12);
        Numbox b2 = new Numbox(12);
        //1.
        int num1 = b1.getNum();
        int num2 = b2.getNum();
        System.out.println(num1 == num2);
        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("b1.equals(b2) : " + b1.equals(b2)); //true
        System.out.println("b1.equals(str1) : " + b1.equals(str1)); //false
        System.out.println("b1.equals(null) : " + b1.equals(null)); //false
    }
}
class Numbox extends Object { //기본생성자 없음
    private int num;
    public Numbox(int num) { this.num = num; }
    public int getNum() { return num; }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Numbox)) { return false; }
        Numbox nb = (Numbox)obj;
        return num == nb.num;
    }
}