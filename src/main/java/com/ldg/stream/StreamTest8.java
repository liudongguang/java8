package com.ldg.stream;

import java.util.stream.IntStream;

/**
 * Created by liudo on 2017/1/23 0023.
 */
public class StreamTest8 {
    public static void main(String[] args) {
        /////010101010101这个程序不会结束
        // IntStream.iterate(0,i->(i+1)%2).distinct().limit(6).forEach(System.out::println);
        //这样就会结束
        IntStream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
