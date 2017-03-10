package com.ldg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by liudo on 2017/2/6 0006.
 */
public class StreamTest13 {
    public static void main(String[] args) {
        Student stu1=new Student("zhangsan",100,20);
        Student stu2=new Student("lisi",90,20);
        Student stu3=new Student("wangwu",90,30);
        Student stu4=new Student("zhangsan",80,40);
        List<Student> students= Arrays.asList(stu1,stu2,stu3,stu4);
        //1.按姓名分组
       Map<String,List<Student>> map= students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);
        /////2.获取分组及其个数
       Map<String,Long> map2= students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
        System.out.println(map2);

    }
}
