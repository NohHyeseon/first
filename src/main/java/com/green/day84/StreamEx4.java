package com.green.day84;


import java.io.File;
import java.util.stream.Stream;


//책에 있는 Ex2
public class StreamEx4 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"), new File("Ex1.bak")
                , new File("Ex2.java"), new File("Ex2"), new File("Ex2.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr); //레퍼런스타입이라 of사용
        System.out.println("--------");
        Stream<String> strStream = fileStream.map(item -> item.getName());
        strStream.forEach(System.out::println);
        System.out.println("--------");

        Stream.of(fileArr).map(File::getName)
                .filter(item -> item.indexOf('.') != -1) //-1이 아니라면 통과 indexOf문자열에서 특정 문자열찾는메소드
                .map(item -> item.substring(item.indexOf('.')+1))
                .map(item -> item.toUpperCase())
                .distinct()
                .forEach(System.out::println);

    }
}
