package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.*;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy");
        Date dateNow = new Date(date);
        Date yearBegin = new Date(dateNow.getYear(),0,1);

        long difference = dateNow.getTime()  - yearBegin.getTime();
        long days =1 + difference/(24*60*60*1000);



        System.out.println(format.format(yearBegin));
        System.out.println(format.format(dateNow));
        if(days % 2 != 0)
            return true;
        else return false;
    }
}
