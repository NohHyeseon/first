package com.green.day84;


import com.sun.jdi.IntegerValue;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream.iterate(0, item -> item + 2)//인자 두개받음 1,seed값 2,function? 이것도 무한스트림만듬
                .mapToInt(Integer::valueOf)
                //.mapToInt(item ->{return  Integer.valueOf(item);});
                .skip(2) //2까진 skip
                .limit(10)
                .boxed()
                //.forEach(System.out::println);
                .forEach(item -> System.out.print(item + ",")); //위랑 같은 역할

        //제일 처음 0이 들어감 return 0+2,
        //return한 값이 시드가 됨 그래서 return 2+2
        //4 + 2가 return
        System.out.println();
    }
}
