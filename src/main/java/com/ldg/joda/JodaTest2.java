package com.ldg.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.util.Date;

/**
 * Created by LiuDongguang on 2017/9/4.
 */
public class JodaTest2 {
    public static void main(String[] args) {
        DateTime today=new DateTime();
        DateTime tomorrow=today.plusDays(1);//增加一天
        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        System.out.println("----------------");
        DateTime d1=today.withDayOfMonth(1);//将天设置为1
        System.out.println(d1.toString("yyyy-MM-dd"));
        System.out.println("----------------");
        LocalDate localDate=new LocalDate();
        System.out.println(localDate);
        System.out.println("----------------");
         //计算距离当前后面三个月第一天的日期
        localDate=localDate.plusMonths(3).dayOfMonth().withMinimumValue();
        System.out.println(localDate);
        System.out.println("----------------");
        //计算两年前第三个月最后一天日期
        DateTime dateTime1=new DateTime();
        DateTime dateTime2=dateTime1.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMinimumValue();
        System.out.println(dateTime2.toString("yyyy-MM-dd"));
        System.out.println("----------------");

    }
}
