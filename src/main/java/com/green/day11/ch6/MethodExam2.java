package com.green.day11.ch6;

public class MethodExam2 {
    String scoreResultOpt(int n) {
        if(n < 0 || n > 100) {
            return "점수를 확인해 주세요";
        }
        String grade = "C";
        if(n == 100) {
            return "A+학점";
        } else if(n < 70) {
            return "D학점";
        } else if(n >= 90) {
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
        return grade + opt + "학점";
    }
}
