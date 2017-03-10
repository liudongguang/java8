package com.ldg.stream;

import java.util.stream.IntStream;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public class StreamTest2 {
    public static void main(String[] args) {
       IntStream intStream= IntStream.of(2,3,4,6,7,8,5);
       intStream.forEach(System.out::println);
       ///////
        System.out.println("-------------------------------------");
        IntStream.range(3,8).forEach(System.out::println);
        System.out.println("-------------------------------------");
        IntStream.rangeClosed(3,8).forEach(System.out::println);
    }
}
