package com.green.day11.ch6;

public class MethodExam2 {
    String scoreResultOpt(int n) {
        if(n < 0 || n > 100) {
            return "점수를 확인해 주세요";
        } else if(n == 100) {
            return "A+학점";
        } else if(n < 70) {
            return "D학점";
        }
        String grade = "C";
        if(n >= 90) {
            grade = "A";
        } else if(n >= 80) {
            grade = "B";
        }
        //70~99점
        String opt = "0";
        int modVal = n % 10;
        if(modVal >= 8) {
            opt = "+";
        } else if(modVal <= 3) {
            opt = "-";
        }
        String result = String.format("%s%s학점", grade, opt);
        return result;
    }

    String getSeason(int mon) {
        switch(mon) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 12, 1, 2:
                return "겨울";
        }
        return "없음";
    }

    String getSeason2(int mon) {
        if(mon < 1 || mon > 12) {
            return "없음";
        }
        switch(mon) {
            case 12, 1, 2:
                return "겨울";
        }
        if(mon >= 9) {
            return "가을";
        } else if(mon >= 6) {
            return "여름";
        }
        return "봄";
    }
}
