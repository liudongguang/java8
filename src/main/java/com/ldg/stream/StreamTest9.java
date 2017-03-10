package com.ldg.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by liudo on 2017/2/6 0006.
 */
public class StreamTest9 {
    public static void main(String[] args) {
        //准备五百万uuid
        List<String> list=new ArrayList<>(5000000);
        for(int i=0;i<5000000;i++){
            list.add(UUID.randomUUID().toString());
        }
        ///////////
        System.out.println("开始排序....");
        long startTime=System.nanoTime();
        list.stream().sorted().count();
        long endTime=System.nanoTime();
        System.out.println("结束排序...."+(TimeUnit.NANOSECONDS.toMillis(endTime-startTime)));


        System.out.println("并行流开始排序....");
        long startTime2=System.nanoTime();
        list.parallelStream().sorted().count();
        long endTime2=System.nanoTime();
        System.out.println("并行流结束排序...."+(TimeUnit.NANOSECONDS.toMillis(endTime2-startTime2)));
    }
}
