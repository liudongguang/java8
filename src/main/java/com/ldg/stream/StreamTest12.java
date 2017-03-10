package com.ldg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by liudo on 2017/2/6 0006.
 */
public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Hi","Hello","你好");
        List<String> list2=Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
        List<String> result=list1.stream().flatMap(item->list2.stream().map(item2->item+"  "+item2)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
