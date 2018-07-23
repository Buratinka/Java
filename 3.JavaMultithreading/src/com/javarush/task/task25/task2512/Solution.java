package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e)
    {
        t.interrupt();

        List<Throwable> list = new ArrayList<>();

        while(e != null)
        {
            list.add(e);
            e = e.getCause();
        }

        Collections.reverse(list);

        for(Throwable el : list)
        {
            System.out.println(el)  ;
        }

    }

    public static void main(String[] args) {
    }
}
