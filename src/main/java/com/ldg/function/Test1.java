package com.ldg.function;

import java.util.function.Function;

/**
 * Created by liudo on 2017/2/17 0017.
 */
public class Test1 {
    public static void main(String[] args) {

    }
    public static String compute1(Integer a, Function<Integer,String> f1,Function<String,Integer> f2){
        return f1.compose(f2).apply(a.toString());
    }

    public static Integer compute2(Integer a, Function<Integer,String> f1,Function<String,Integer> f2){
        return f1.andThen(f2).apply(a);
    }
}
