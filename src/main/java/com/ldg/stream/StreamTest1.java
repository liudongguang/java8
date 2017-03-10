package com.ldg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public class StreamTest1 {
    public static void main(String[] args) {
         //1.通过静态方法
        Stream stream1=Stream.of("hello","world","helloworld");
        //2.通过一个数组
        String[] myArr=new String[]{"hello","world","helloworld"};
        Stream stream2=Stream.of(myArr);

        //3.通过集合创建
        List<String> list= Arrays.asList(myArr);
        Stream stream3=list.stream();
    }
}
