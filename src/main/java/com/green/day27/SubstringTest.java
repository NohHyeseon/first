package com.green.day27;

public class SubstringTest {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";

        String r1 = str.substring(2, 4);
        System.out.println("r1 : " + r1);

        System.out.println("r2 : "
                + str.substring(4));

        System.out.println(str);
    }
}
