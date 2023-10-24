package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
        //num = num / 0;
        try {
            num = 10;
            num = num / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생!!");
            num = -1;
        } finally {
            System.out.println("finally 실행!!!");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("---끝---");
    }
}

class ExceptionEx1_2 {
    public static void main(String[] args) {
        div(20);
    }

    public static void div(int num) {
        try {
            num = 10;
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생!!");
            num = -1;
        } finally {
            num += 1;
            System.out.println("finally 실행!!!");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("---끝---");
    }
}

class ExceptionEx1_3 {
    public void sum() {}
    public static void main(String[] args) {
        try {
            //int num = 10 / 0;
            //ExceptionEx1_3 obj = null;
            //obj.sum();
            int[] arr = new int[10];
            arr[10] = 10;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("수학적 예외");
        } catch (NullPointerException e) {
            System.out.println("널포인트 예외");
        } catch (Exception e) {
            System.out.println("모든 예외");
        }
        System.out.println("끝!!!");
    }
}