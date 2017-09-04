package com.ldg.joda;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Created by LiuDongguang on 2017/9/4.
 */
public class Java8TimeTest {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear()+"    "+localDate.getMonthValue()+"    "+localDate.getDayOfMonth());
        System.out.println("----------------");
        LocalDate localDate2=LocalDate.of(2017,3,3);
        System.out.println(localDate2);
        System.out.println("----------------");
        LocalDate localDate3=LocalDate.of(2010,3,25);
        MonthDay monthDay=MonthDay.of(localDate3.getMonth(),localDate3.getDayOfMonth());
        MonthDay monthDay2=MonthDay.from(LocalDate.of(2011,3,25));
        if(monthDay.equals(monthDay2)){
            System.out.println("月与日相等！");
        }else {
            System.out.println("月与日不相等！");
        }
        System.out.println("----------------");
        LocalTime time =LocalTime.now();
        System.out.println(time);
        LocalTime time2=time.plusHours(3).plusMinutes(31);
        System.out.println(time2);
        System.out.println("----------------");
        LocalDate localDate4=localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate4);
        System.out.println("----------------");
        LocalDate localDate5=localDate.minus(2, ChronoUnit.MONTHS);
        System.out.println(localDate5);
        System.out.println("----------------");
        Clock clock=Clock.systemDefaultZone();
        System.out.println(clock.millis());
        System.out.println("----------------");
        LocalDate localDate6=LocalDate.now();
        LocalDate localDate7=LocalDate.of(2017,3,3);
        System.out.println(localDate6.isBefore(localDate7));
        System.out.println(localDate6.isAfter(localDate7));
        System.out.println(localDate6.equals(localDate7));
        System.out.println("----------------");
    }
}
