package com.ldg.collector;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/**
 * Created by LiuDongguang on 2017/6/9.
 */
public class MyListCollector<T> implements Collector<T,List<T>,List<T>> {
    @Override
    public Supplier<List<T>> supplier() {
        System.out.println("supplier");
       // return ArrayList::new;
        return ()->{
          System.out.println("new ArrayList");
          return new ArrayList<>();
        };
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return (list,item)->{
            System.out.println("accumulator----"+Thread.currentThread().getName());
            list.add(item);
        };
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list1,list2)->{
            System.out.println("combiner");
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        return list->{
            List<T> list2=new ArrayList<>();
            list.forEach(ii->{
                list2.add(ii);
            });
            return list2;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
           List<String> ll=Arrays.asList("1","2","3","4","5","6","7");
           List<String> kk=ll.parallelStream().collect(new MyListCollector<>());
           System.out.println(kk);
    }
}
