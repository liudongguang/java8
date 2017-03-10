package com.ldg.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by liudo on 2017/1/20 0020.
 */
public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> stream=Stream.generate(UUID.randomUUID()::toString);
       // System.out.println(stream.findFirst().get());
         stream.findFirst().ifPresent(System.out::println);
         ///////
        Stream.iterate(1,item->item+2).limit(6).forEach(System.out::println);
        //////////
        System.out.println("------------------找出大于2的元素（过滤），每个元素乘以二（运算），忽略前两个元素,获取前两个元素，求出总和(取出元素的总和)-------------------------------------------");
        Stream<Integer> intstream= Stream.iterate(1,item->item+2).limit(6);
       int sum=intstream.filter(item->item>2).mapToInt(item->item*2).skip(2).limit(2).sum();
        System.out.println(sum);
        System.out.println("------------------找出大于2的元素（过滤），每个元素乘以二（运算），忽略前两个元素,获取前两个元素，找出最小的元素-------------------------------------------");
        Stream<Integer> intstream2= Stream.iterate(1,item->item+2).limit(6);
        OptionalInt optionalInt=intstream2.filter(item->item>2).mapToInt(item->item*2).skip(2).limit(2).min();
        //
        optionalInt.ifPresent(System.out::println);
        ///////////////////////////////////同时找到最大值，最小值，求总和
        System.out.println("----------------------------------------------------------------------------");
        IntSummaryStatistics intSummaryStatistics= Stream.iterate(1, item->item+2).limit(6).filter(item->item>2).mapToInt(item->item*2).skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println("----------------------------------------------------------------------------");
        Stream<Integer> intstream3= Stream.iterate(1,item->item+2).limit(6);//定义6个元素的stream
        System.out.println(intstream3);
        System.out.println(intstream3.filter(item->item>2));//这里返回新的stream
      //  System.out.println(intstream3.distinct());//但是这里使用了已经操作过的stream所以会报错！

        System.out.println("--------------------------规避stream问题--------------------------------------------------");
        Stream<Integer> intstream4= Stream.iterate(1,item->item+2).limit(6);//定义6个元素的stream
        System.out.println(intstream4);
        Stream<Integer> intstream41=intstream4.filter(item->item>2);
        System.out.println(intstream41);
        Stream<Integer> stream4_2=intstream41.distinct();
        System.out.println(stream4_2);
    }
}
