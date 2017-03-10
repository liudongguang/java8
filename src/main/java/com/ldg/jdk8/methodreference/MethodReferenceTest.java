package com.ldg.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public class MethodReferenceTest {
    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }
    public String getString2(String str, Function<String,String> function) {
        return function.apply(str);
    }
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 30);
        Student s2 = new Student("lisi", 10);
        Student s3 = new Student("wangwu", 50);
        Student s4 = new Student("zhaoliu", 40);
        List<Student> list = Arrays.asList(s1, s2, s3, s4);
        list.sort(Student::compareStudentByScore2);
        System.out.println(list);
        ////////////
        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjin", "beijing");
        // Collections.sort(cities,(c1,c2)->c1.compareToIgnoreCase(c2));
        System.out.println(cities);
        Collections.sort(cities, String::compareToIgnoreCase);
        cities.forEach(System.out::println);//属于    对象名::实例方法名
        //4.构造方法引用
        MethodReferenceTest mt = new MethodReferenceTest();
        System.out.println(mt.getString(String::new));

        ////
        System.out.println(mt.getString2("hello",String::new));
        System.out.println(mt.getString2("hello",a->a+"dddd"));
    }
}
