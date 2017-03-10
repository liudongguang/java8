package com.ldg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * Created by liudo on 2017/2/6 0006.
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("hello","world","hello world");
        //获取长度为五的第一个单词，同时打印长度
       OptionalInt optInt= list.stream().mapToInt(item->item.length()).filter(lengh->lengh==5).findFirst();
        optInt.ifPresent(System.out::println);
        //会短路运算
        OptionalInt optInt2= list.stream().mapToInt(item->{
            int length=item.length();
            System.out.println(item);
            return length;
        }).filter(lengh->lengh==5).findFirst();
        optInt2.ifPresent(System.out::println);
    }
}
