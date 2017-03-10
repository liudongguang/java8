package com.ldg.first;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liudo on 2017/3/6 0006.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String ,String > m=new HashMap<>();
        m.put("b","b");
         String rs=m.computeIfAbsent("a",key->{
             System.out.println("6666666666666");
                return "建立扩大收费";
         });
        System.out.println(rs);
    }
}
