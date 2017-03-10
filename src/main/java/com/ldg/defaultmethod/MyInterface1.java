package com.ldg.defaultmethod;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public interface MyInterface1 {
    default  void myMethod(){
        System.out.println("mymethod1111");
    }
}
