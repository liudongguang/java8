package com.ldg.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        //值都乘以2   然后累加
       int sum= list.stream().map(i->i*2).reduce(0,Integer::sum);//Integer::sum接受两个参数返回一个参数
        System.out.println(sum);
    }
}
