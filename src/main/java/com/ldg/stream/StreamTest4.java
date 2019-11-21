package com.ldg.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by liudo on 2017/1/20 0020.
 */
public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello","world","helloworld");
      //  String[] stringArray=stream.toArray(length->new String[length]);
        String[] stringArray=stream.toArray(String[]::new);
        Arrays.asList(stringArray).forEach(System.out::println);
        System.out.println("-----------------流转list-------------------------");
        Stream<String> stream2 = Stream.of("hello","world","helloworld");
       //List<String> list=stream.collect(Collectors.toList());
       // List<String> list=stream.collect(()->new ArrayList<>(),(theList,item)->theList.add(item),(theList1,theList2)->theList1.addAll(theList2));
         List<String> list=stream2.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        list.forEach(System.out::println);

        System.out.println("----------------ArrayList-------------------------");
        Stream<String> stream3 = Stream.of("hello","world","helloworld");
        List<String> list2=stream3.collect(Collectors.toCollection(ArrayList::new));
        list2.forEach(System.out::println);
        System.out.println("-----------------------TreeSet------------------");
        Stream<String> stream4 = Stream.of("hello","world","helloworld");
        Set<String> set=stream4.collect(Collectors.toCollection(TreeSet::new));
        set.forEach(System.out::println);
        System.out.println("----------------Collectors.joining-------------------------");
        Stream<String> stream5 = Stream.of("hello","world","helloworld");
        String str=stream5.collect(Collectors.joining());
        System.out.println(str);

    }
}
