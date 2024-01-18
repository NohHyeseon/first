package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest2 {
    public static void main(String[] args) {
        String str1 = "adfAdfdf";
        String str2 = "adfAdfdf OO";
        String str3 = "ABCD12";
        String str4 = "ABCD12";
        String regexp = "^[a-z|A-Z]*$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp, str3));

    }
}
