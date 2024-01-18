package com.green.test;

import java.util.regex.Pattern;

public class RegTest4 {
    public static void main(String[] args) {
        // 5. 공백, 탭을 허용하는 정규식
        final String REGEXP_PATTERN_SPACE_CHAR = "^[\\s]*$";

        // 6. 공백, 탭이 아닌 경우를 허용하는 정규식
        final String REGEXP_PATTERN_SPACE_NO_CHAR = "^[\\S]*$";

        String str1 = "공백/스페이스 테스트";        // 문자열로만 구성
        String str2 = "공백/스페이스 테스트     ";    // 문자열과 스페이스로 구성
        String str3 = "공백/스페이스 테스트        ";   // 문자열과 탭으로 구성
        String str4 = "   ";                        // 스페이스만으로 구성
        String str5 = "         ";                          // 탭으로만 구성
        String str6 = "";                          // 빈문자열


        System.out.printf("%s => %b\n", str1, Pattern.matches(REGEXP_PATTERN_SPACE_CHAR, str1));
        System.out.printf("%s => %b\n", str2, Pattern.matches(REGEXP_PATTERN_SPACE_CHAR, str2));
        System.out.printf("%s => %b\n", str3, Pattern.matches(REGEXP_PATTERN_SPACE_CHAR, str3));
        System.out.printf("%s => %b\n", str4, Pattern.matches(REGEXP_PATTERN_SPACE_CHAR, str4));
        System.out.printf("%s => %b\n", str5, Pattern.matches(REGEXP_PATTERN_SPACE_CHAR, str5));
        System.out.printf("%s => %b\n", str6, Pattern.matches(REGEXP_PATTERN_SPACE_CHAR, str6));
        System.out.println("-----------");
        System.out.printf("%s => %b\n", str1, Pattern.matches(REGEXP_PATTERN_SPACE_NO_CHAR, str1));
        System.out.printf("%s => %b\n", str2, Pattern.matches(REGEXP_PATTERN_SPACE_NO_CHAR, str2));
        System.out.printf("%s => %b\n", str3, Pattern.matches(REGEXP_PATTERN_SPACE_NO_CHAR, str3));
        System.out.printf("%s => %b\n", str4, Pattern.matches(REGEXP_PATTERN_SPACE_NO_CHAR, str4));
        System.out.printf("%s => %b\n", str5, Pattern.matches(REGEXP_PATTERN_SPACE_NO_CHAR, str5));
        System.out.printf("%s => %b\n", str6, Pattern.matches(REGEXP_PATTERN_SPACE_NO_CHAR, str6));
    }
}
