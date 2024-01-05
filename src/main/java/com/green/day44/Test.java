package com.green.day44;

public class Test {
    public static void main(String[] args) {
        MyInfo mi = new MyInfo()
                .title("ddd")
                .description("인스타 클론 코딩");


        MyInfo mi2 = mi.title("gggg");

        System.out.println(mi == mi2);
        mi.description("zzzz");
        System.out.println(mi);

        MyOpenAPI moa = new MyOpenAPI().info(mi);
    }
}
