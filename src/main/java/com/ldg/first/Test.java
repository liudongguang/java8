package com.ldg.first;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by liudo on 2017/2/10 0010.
 */
public class Test {
    public static void main(String[] args) {
       // Test.testExtends();
      //  Test.testSuper();
        Test.test3();
    }
    public static void test3(){

        List<? extends Fruit> list000=new ArrayList<Fruit>();
        List<? extends Fruit> elist111=new ArrayList<Apple>();
        List<? extends Fruit> elist222=new ArrayList<RedApple>();
       // list.add(new Apple());
        List<? super Fruit> list2= new ArrayList<>();//实现自动向下转型，父类是Fruit的都可以赋值
        list2.add(new Apple());
        list2.add(new Fruit());
        list2.add(new Pear());
        list2.add(new RedApple());




        List<? super Fruit> list3=new ArrayList<Object>(); //只要是基类就可以赋值
        list3.add(new RedApple());
        list3.add(new Apple());
        list3.add(new Fruit());
        List<? super Apple> list4=new ArrayList<Fruit>();
        list4.add(new RedApple());
        list4.add(new Apple());
        List<? super RedApple> list5=new ArrayList<Apple>();
        list5.add(new RedApple());
    }
    public static void testSuper(){
        Plate<? super Fruit> p=new Plate<>(new Apple());//下界
        p.set(new Fruit());
        p.set(new Apple());
        p.set(new Pear());
    }

    public static void testExtends(){
        Plate<? extends Fruit> p=new Plate<>(new Apple());//上界  不能往里存，只能往外取   自动向上转型
        Apple apple=new Apple();
        //p.set(apple);
        // p.set(new Fruit());
        //读取出来的东西只能存放在Fruit或它的基类里
        Fruit fruit=p.get();
        Object fruit2=p.get();
        Apple getApple=(Apple)p.get();
        System.out.println(fruit.getClass());
        ///////////////////////
        Plate<Apple> apples=new Plate<>(new Apple());
        p=apples;
        //////////////////////////////////////////////////
        List<? extends Fruit> list1=new ArrayList<Fruit>();
        List<? extends Fruit> list2=new ArrayList<Apple>();
        List<? extends Fruit> list3=new ArrayList<RedApple>();
        List<? extends Apple> list4=new ArrayList<RedApple>();



    }
}
