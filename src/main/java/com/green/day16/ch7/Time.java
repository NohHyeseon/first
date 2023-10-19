package com.green.day16.ch7;

public class Time {
    private int hour, minute, second;

    //1. 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //2. setter 메소드
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%d시 %d분 %d초"
                , hour, minute, second);
    }
}


class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(11, 20, 30);
        time.setMinute(30);

        System.out.println(time); //10시 20분 30초
        //time.hour = 10;
    }
}
