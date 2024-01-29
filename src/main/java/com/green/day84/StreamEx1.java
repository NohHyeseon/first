package com.green.day84;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArr = {10, 2, 22, 80, 90, 33};
         Integer[] integerArr = {10, 2, 22, 80, 90, 33};
        Stream<Integer> stream1 = Stream.of(integerArr);//레퍼런스타입일 때 사용
//        Stream<Integer> stream1 = Arrays.stream(intArr).boxed(); boxed는 프라머티브타입에서만 사용 int를 integer로 박스를 씌웠다란 의미
        Stream<Integer> stream2 = Stream.of(integerArr);
        Stream<Integer> stream = IntStream.of(intArr).boxed();
        List<Integer> list = stream1.sorted().limit(3).collect(Collectors.toList()); //sort가 중간연산(여러번가능) collect가 최종연산(1번)
        System.out.println("------------");

        IntStream.of(intArr).boxed()
                .sorted()
                .limit(4)
                .forEach(item -> System.out.print(item +","));

        System.out.println();
        System.out.println(list);
        System.out.println(Arrays.toString(intArr));
        //limit은 세개까지 자르는거
        //collect가 있어야 발현함 최종연산이 있어야 중간연산이 실행될 수 있음.


    }
}
