package com.ldg.defaultmethod;

/**
 * Created by liudo on 2017/1/19 0019.
 */
public class Myclass implements MyInterface1,Myinterface2{
    /**
     * 两个接口都有相同的方法，必须重写这个方法才能使用
     */
    @Override
    public void myMethod() {
       // System.out.println(666666);
        Myinterface2.super.myMethod();//找特定接口的方法
    }

    public static void main(String[] args) {
        Myclass mc=new Myclass();
        mc.myMethod();
    }
}
