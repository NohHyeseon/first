package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest6 {
    public static void main(String[] args) {
        String str1 = "990230-1223456";
        String str2 = "9912031-1223456";
        String str3 = "991203-21223456";
        String str4 = "991203-2223456";
        String str5 = "991203-3223456";
        String str6 = "991203-4223456";
        String str7 = "991203-5223456";
        String str8 = "99120-423456";
        //010, 011, 016, 017, 018, 019
        //String regexp = "^[\\d]{6}-[1-4]{1}[0-9]{6}$";
        String regexp = "^[\\d]{2}((02(0[1-9]|1[0-9]|2[0-9]))|(0[1|3-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1]))-[1-4][0-9]{6}$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5, Pattern.matches(regexp, str5));
        System.out.printf("%s > %b\n", str6, Pattern.matches(regexp, str6));
        System.out.printf("%s > %b\n", str7, Pattern.matches(regexp, str7));
        System.out.printf("%s > %b\n", str8, Pattern.matches(regexp, str8));

    }
}
