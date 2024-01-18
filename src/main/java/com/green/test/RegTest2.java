package com.green.test;

import java.util.regex.Pattern;

public class RegTest2 {
    public static void main(String[] args) {
        // 1. 문자열만 허용하는 정규식 - 공백 미 허용
        final String REGEXP_PATTERN_CHAR = "^[\\w]*$";

        // 2. 문자열만 허용하는 정규식 - 공백 허용
        final String REGEXP_PATTERN_NO_CHAR = "^[\\W]*$";
        //문자열 [(a-z, A-Z, 0-9, _)]
        String str1 = "hellow";         // 문자열로만 구성
        String str2 = "hellow23";       // 문자열과 숫자로 구성
        String str3 = "hello :D";     // 문자열과 특수문자로 구성
        String str4 = "hello0011_";     // 문자열과 언더바로 구성
        String str5 = "hello-0011";     // 문자열과 언더바로 구성
        String tabStr = "hellow    ";   // 탭이 포함된 문자열
        String spaceStr = "hellow ";    // 스페이스바가 포함된 문자열

        System.out.printf("%s => %b\n", str1, Pattern.matches(REGEXP_PATTERN_CHAR, str1));
        System.out.printf("%s => %b\n", str2, Pattern.matches(REGEXP_PATTERN_CHAR, str2));
        System.out.printf("%s => %b\n", str3, Pattern.matches(REGEXP_PATTERN_CHAR, str3));
        System.out.printf("%s => %b\n", str4, Pattern.matches(REGEXP_PATTERN_CHAR, str4));
        System.out.printf("%s => %b\n", str5, Pattern.matches(REGEXP_PATTERN_CHAR, str5));
        System.out.printf("%s => %b\n", tabStr, Pattern.matches(REGEXP_PATTERN_CHAR, tabStr));
        System.out.printf("%s => %b\n", spaceStr, Pattern.matches(REGEXP_PATTERN_CHAR, spaceStr));
    }
}
