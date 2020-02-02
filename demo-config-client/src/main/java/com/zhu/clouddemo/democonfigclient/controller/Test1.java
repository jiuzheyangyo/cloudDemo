package com.zhu.clouddemo.democonfigclient.controller;

import jdk.nashorn.internal.runtime.JSONFunctions;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Test1 {
    public static void main(String[] args) throws ParseException {
        String[] ns = "31D223NBD".split("N");
        String[] ds = ns[0].split("D");
        BigDecimal roomDates = BigDecimal.valueOf(Long.valueOf(ds[1]));
        System.out.println(roomDates);
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2019-12-25");
        LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2019-12-25");
        LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        BigDecimal length = BigDecimal.valueOf(Period.between(localDate1,localDate2).getDays());
        System.out.println(length);
        List<Person> list = new ArrayList<>();
        list.add(new Person("zhu",12));
        list.add(new Person("jun",32));
        list.add(new Person("rong",52));
        List<Person> collect = list.stream().map(item -> {
             item.setAge(33);
             return item;
        }).collect(Collectors.toList());
        System.out.println(collect.get(0).getAge()+collect.get(0).getName());
    }
}
