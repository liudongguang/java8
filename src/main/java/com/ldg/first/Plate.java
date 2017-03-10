package com.ldg.first;

/**
 * Created by liudo on 2017/2/10 0010.
 */
public class Plate<T> {
    private T item;
    public Plate(T t){
        item=t;
    }
    public void set(T t){
        item=t;
    }
    public T get(){
        return item;
    }
}
