package com.ldg.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liudo on 2017/2/9 0009.
 */
public class GenericTest {
    public static void main(String[] args) {
        GenericTest.t1();
    }

    public static void t2(){
        List<Fruit> fruits1=new ArrayList<>();
        Fruit f1=new Fruit();
        f1.setName("水果1");
        fruits1.add(f1);
        List<? super Apple> apples=new ArrayList<>();
        // fruits2.add(f1);
        List<Apple> apples2=new ArrayList<>();
        Apple apple=new Apple();
        apple.setName("苹果");
        apple.setColor("红色");
        apples.add(apple);
        //apples.add(f1);
        //  fruits2.add(apple);
        List<Cat> cats=new ArrayList<>();


        apples=fruits1;
        apples=apples2;

        f1=apple;
        apple=(Apple)f1;

    }
    public static void t1(){
        List<Fruit> fruits1=new ArrayList<>();
        Fruit f1=new Fruit();
        f1.setName("水果1");
        fruits1.add(f1);
        List<? extends Fruit> fruits2=new ArrayList<>();
       // fruits2.add(f1);
        List<Apple> apples=new ArrayList<>();
        Apple apple=new Apple();
        apple.setName("苹果");
        apple.setColor("红色");
        apples.add(apple);
        //  fruits2.add(apple);
        List<Cat> cats=new ArrayList<>();
        //fruits1=apples;
        fruits2=apples;
        fruits2=fruits1;
        Apple a=(Apple)f1;
        f1=a;
        //apples=fruits2;
       // apples=(List<Apple>)fruits1;
        apples=(List<Apple>)fruits2;


         //////
        System.out.println("--------------------");
        testExtends(apples);
        System.out.println("--------apples end------------");
        testExtends(fruits1);
        System.out.println("--------------------");
    }
    public  static void testExtends(List<? extends Fruit> fruits){
        fruits.forEach(item-> System.out.println(item));
    }
}
