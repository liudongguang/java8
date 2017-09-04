package com.ldg.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created by LiuDongguang on 2017/9/4.
 */
public class JodaTest3 {
    //标准UTC时间：2014-11-04T09:22:54.876Z  不带时区，是一个绝对的时间，在不同的时区上时间不一样
    //utc时间转日期类型
    public static Date convertUTC2Date(String utcDate) {
        try {
            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        } catch (Exception e) {
            return null;
        }
    }
    //给定java日期转UTC
    public static String convertDate2UTC(Date javaDate){
        DateTime dateTime=new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }
   //格式化日期
    public static String convertDate2LocalByDateFormat(Date javaDate,String dateFormat){
        DateTime dateTime=new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }
    public static void main(String[] args) {
        System.out.println(JodaTest3.convertUTC2Date("2014-11-04T09:22:54.876Z"));
        System.out.println(JodaTest3.convertDate2UTC(new Date()));
        System.out.println(JodaTest3.convertDate2LocalByDateFormat(new Date(),"yyyy-MM-dd HH:mm:ss"));
    }

}
