package com.green.test;

import java.util.regex.Pattern;

public class RegTest3 {
    public static void main(String[] args) {
        // 3. 숫자만 허용하는 정규식
        final String REGEXP_PATTERN_NUMBER = "^[\\d]*$";

        // 4. 숫자가 아닌 경우 허용하는 정규식
        final String REGEXP_PATTERN_NO_NUMBER = "^[\\D]*$";

        String str1 = "1234";           // 숫자로만 구성
        String str2 = "1234AD";         // 숫자와 문자로 구성
        String str3 = "1234   ";        // 숫자와 탭의 조합으로 구성
        String str4 = "aBD";        // 문자열로 구성

        System.out.printf("%s => %b\n", str1, Pattern.matches(REGEXP_PATTERN_NUMBER, str1));
        System.out.printf("%s => %b\n", str2, Pattern.matches(REGEXP_PATTERN_NUMBER, str2));
        System.out.printf("%s => %b\n", str3, Pattern.matches(REGEXP_PATTERN_NUMBER, str3));
        System.out.printf("%s => %b\n", str4, Pattern.matches(REGEXP_PATTERN_NUMBER, str4));
        System.out.println("-----------");
        System.out.printf("%s => %b\n", str1, Pattern.matches(REGEXP_PATTERN_NO_NUMBER, str1));
        System.out.printf("%s => %b\n", str2, Pattern.matches(REGEXP_PATTERN_NO_NUMBER, str2));
        System.out.printf("%s => %b\n", str3, Pattern.matches(REGEXP_PATTERN_NO_NUMBER, str3));
        System.out.printf("%s => %b\n", str4, Pattern.matches(REGEXP_PATTERN_NO_NUMBER, str4));
    }
}
