package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        //Scanner를 이용하여 성별을 입력 (남자, 여자)
        //만약에 남자가 입력되었다면 콘솔에 "잘 생겼다." 출력
        //만약에 여자가 입력되었다면 콘솔에 "예쁘다." 출력
        //남자, 여자가 아닌 값이 입력되었다면 "누구냐." 출력

        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력 (여자, 남자) >>");
        String gender = scan.nextLine();

        String msg = "누구냐";
        if("여자".equals(gender)) {
            msg = "예쁘다";
        } else if("남자".equals(gender)) {
            msg = "잘 생겼다.";
        }
        System.out.println(msg);
    }
}
