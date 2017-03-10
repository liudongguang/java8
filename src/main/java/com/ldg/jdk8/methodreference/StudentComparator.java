package com.ldg.jdk8.methodreference;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public class StudentComparator {
    public static int compareStudentByScore(Student st1,Student st2){
        return st1.getScore()-st2.getScore();
    }
    public static int compareStudentByName(Student st1,Student st2){
        return st1.getName().compareToIgnoreCase(st2.getName());
    }
}
