package com.ldg.stream;

import java.util.function.Function;

/**
 * Created by liudo on 2017/2/8 0008.
 */
public class TestFunction {
    public static void main(String[] args) {
      //  TestFunction.test1(100);
        TestFunction.test2(100);
    }

    public static void test1(int a){
        Function<Integer,Integer> f1=item->item+123;
        Function<Integer,Integer> f2=item->item+222;
        int result=f1.apply(f2.apply(a));
        System.out.println(result);

        System.out.println("---------------------");
        int result2=f1.compose(f2).apply(100);
        System.out.println(result2);
    }
    public static void test2(int a){
        Function<Integer,String> f1=item->item+123+"dddddddddddddddddddddddddd";
        Function<String,Integer> before=item->Integer.valueOf(item)+222;
        System.out.println("---------------------");
        String result2=f1.compose(before).apply("100");
        System.out.println(result2);
    }

}
