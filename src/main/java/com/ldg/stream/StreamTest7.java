package com.ldg.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liudo on 2017/1/23 0023.
 */
public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("hello","world","hello world");
        //首字母大写
     //  list.stream().map(item->item.substring(0,1).toUpperCase()+item.substring(1)).forEach(System.out::println);
        System.out.println("-----------------没有及早操作或终止操作就没有中间操作的执行，所以test不会打印-----------------------");
        list.stream().map(item->{
            String result=item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test......");
            return result;
        });
        System.out.println("-----------------------------------------");
        list.stream().map(item->{
            String result=item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test......");
            return result;
        }).forEach(System.out::println);
    }
}
