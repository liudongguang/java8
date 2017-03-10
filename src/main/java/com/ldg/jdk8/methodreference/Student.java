package com.ldg.jdk8.methodreference;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    public static int compareStudentByScore(Student st1,Student st2){
        return st1.getScore()-st2.getScore();
    }
    public static int compareStudentByName(Student st1,Student st2){
        return st1.getName().compareToIgnoreCase(st2.getName());
    }
///////3.类名::实例方法
    public  int compareStudentByScore2(Student st){
        return this.getScore()-st.getScore();
    }
    public  int compareStudentByName2(Student st){
        return this.getName().compareToIgnoreCase(st.getName());
    }

}
