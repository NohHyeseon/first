package com.green.day16.ch7;

public class Time {
    public final static int MIN_HOUR = 0;
    public final static int MAX_HOUR = 23;
    private int hour, minute, second;

    //1. 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //2. setter 메소드
    public void setHour(final int hour) {
        if(hour < MIN_HOUR) { this.hour = MIN_HOUR; return; }
        if(hour > MAX_HOUR) { this.hour = MAX_HOUR; return; }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(final int second) {

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
        return String.format("%02d:%02d:%02d"
                , hour, minute, second);
    }
}


class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(11, 20, 30);
        time.setMinute(3);

        time.setHour(2);
        // 0~23, 만약 23초과값이 들어오면 23이, 0미만 값이 0이 들어가도록

        System.out.println(time); //02:03:30
        //time.hour = 10;
    }
}
