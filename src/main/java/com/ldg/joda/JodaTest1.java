package com.ldg.joda;

import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;

/**
 * Created by LiuDongguang on 2017/9/4.
 */
public class JodaTest1 {
    public static void main(String[] args) {
        IntList intList=new ArrayIntList();
        intList.add(1);
        intList.add(2);
        intList.forEach(System.out::println);
    }
}
