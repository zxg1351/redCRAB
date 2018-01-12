package com.redofmaple;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

@Slf4j
public class Test {

    public static void main(String[] args) {

//        LocalDate date = LocalDate.of(2014, 3, 18);
//        int year = date.getYear();
//        Month month = date.getMonth();
//        int day = date.getDayOfMonth();
//        DayOfWeek dow = date.getDayOfWeek();
//        int len = date.lengthOfMonth();
//        boolean leap = date.isLeapYear();
//        你还可以使用工厂方法从系统时钟中获取当前的日期：
//        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2017, 11, 25);
        System.out.print(date + "\n");
        int year = date.getYear();
        System.out.print(year + "\n");
        Month month = date.getMonth();
        System.out.print(month + "\n");
        int day = date.getDayOfMonth();
        System.out.print(day + "\n");
        DayOfWeek dow = date.getDayOfWeek();
        LocalDate localDate = LocalDate.now();
        System.out.print(localDate.lengthOfMonth());
        System.out.print(localDate.isLeapYear());
        System.out.println(localDate.atStartOfDay());
        System.out.print(dow);
        System.out.print(LocalDate.MAX
                + "\n");
        System.out.print(LocalDate.MIN
                + "\n");
        System.out.print(LocalDate.now()
                + "\n");
        System.out.print(System.currentTimeMillis()
                + "\n");
    }
}
