package com.ldg.function;

import java.util.function.Predicate;

/**
 * Created by liudo on 2017/2/17 0017.
 */
public class Test2 {
    public static void main(String[] args) {

    }
    public static Predicate<String>  method1(){
        Predicate<String> p1=item->item.length()>3;
        Predicate<String> p2=item->item.length()<13;
        String tt="abc";
        return (t) -> p1.test(tt) || p2.test(tt);
    }
    public static Predicate<String>  method2(){
        Predicate<String> p1=item->item.length()>3;
        Predicate<String> p2=item->item.length()<13;
        String tt="abc";
        return (t) -> p1.test(tt) && p2.test(tt);
    }
}
