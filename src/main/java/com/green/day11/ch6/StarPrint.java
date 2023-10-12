package com.green.day11.ch6;

public class StarPrint {
    void line(int cnt) {
        for(int i=0; i<cnt; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    void square(int cnt) {
        for(int z=0; z<cnt; z++) {
            line(cnt);
        }
    }

    void triangle(int cnt) {
        for(int i=1; i<=cnt; i++) {
            line(i);
        }
    }

    String chkGenderById(String id) {
        char ch = id.charAt(7);
        switch(ch) {
            case '2', '4' :
                return "여성";
            case '1', '3':
                return "남성";
        }
        return "유효하지 않은 주민번호";
    }

    int sumFromTo(int min, int max) {
        int sum = 0;
        for(int i=min; i<=max; i++) {
            sum += i;
        }
        return sum;
    }
}
