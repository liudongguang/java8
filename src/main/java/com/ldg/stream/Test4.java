package com.ldg.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld", "a", "b", "c");
        List<String> list = stream.parallel().collect(() ->
        {
            ArrayList<String> lists = new ArrayList<>();
            System.out.println("1111"+lists+"   "+lists.getClass().getClasses());
            return lists;
        }, (theList, item) -> {
            System.out.println("2222"+theList+"   "+theList.getClass().getClasses());
            theList.add(item);
        }, (theList1, theList2) -> {
            System.out.println("3333"+theList1+"-"+theList1.getClass().getClasses()+"  "+theList2+"-"+theList2.getClass().getClasses());
            theList1.addAll(theList2);
        });

    }
}
