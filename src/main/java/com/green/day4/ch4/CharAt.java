package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str2 = "1-23";
        char ch2 = str2.charAt(2);

        System.out.printf("%c - %d\n", ch2, (int)ch2);

        int val = Character.getNumericValue(ch2);
        System.out.println("val : " + val);
        
        switch(val) {
            case 1, 3:
                System.out.println("남자");
                break;
            case 2, 4:
                System.out.println("여자");
                break;
        }


        String str = "abcdefghijk";
        String str3 = str.toUpperCase();
        System.out.println("str : " + str);
        System.out.println("str3 : " + str3);

        System.out.println("result0 : " + str.charAt(0));
        char result = str.charAt(1);
        System.out.println("result1 : " + result);
        System.out.println("result2 : " + str.charAt(2));
    }
}
