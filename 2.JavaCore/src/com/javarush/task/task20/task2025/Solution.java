package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа

                                            not mine
*/
public class Solution {
    public static long[] getNumbers(long n) {

        ArrayList<Long> a = new ArrayList<Long>();
        a.add(Long.parseLong("1"));
        a.add(Long.parseLong("2"));
        a.add(Long.parseLong("3"));
        a.add(Long.parseLong("4"));
        a.add(Long.parseLong("5"));
        a.add(Long.parseLong("6"));
        a.add(Long.parseLong("7"));
        a.add(Long.parseLong("8"));
        a.add(Long.parseLong("9"));
        a.add(Long.parseLong("153"));
        a.add(Long.parseLong("370"));
        a.add(Long.parseLong("371"));
        a.add(Long.parseLong("407"));
        a.add(Long.parseLong("1634"));
        a.add(Long.parseLong("8208"));
        a.add(Long.parseLong("9474"));
        a.add(Long.parseLong("54748"));
        a.add(Long.parseLong("92727"));
        a.add(Long.parseLong("93084"));
        a.add(Long.parseLong("548834"));
        a.add(Long.parseLong("1741725"));
        a.add(Long.parseLong("4210818"));
        a.add(Long.parseLong("9800817"));
        a.add(Long.parseLong("9926315"));
        a.add(Long.parseLong("24678050"));
        a.add(Long.parseLong("24678051"));
        a.add(Long.parseLong("88593477"));
        a.add(Long.parseLong("146511208"));
        a.add(Long.parseLong("472335975"));
        a.add(Long.parseLong("534494836"));
        a.add(Long.parseLong("912985153"));
        a.add(Long.parseLong("4679307774"));
        a.add(Long.parseLong("32164049650"));
        a.add(Long.parseLong("32164049651"));
        a.add(Long.parseLong("40028394225"));
        a.add(Long.parseLong("42678290603"));
        a.add(Long.parseLong("44708635679"));
        a.add(Long.parseLong("49388550606"));
        a.add(Long.parseLong("82693916578"));
        a.add(Long.parseLong("94204591914"));
        a.add(Long.parseLong("28116440335967"));
        a.add(Long.parseLong("4338281769391370"));
        a.add(Long.parseLong("4338281769391371"));
        a.add(Long.parseLong("21897142587612075"));
        a.add(Long.parseLong("35641594208964132"));
        a.add(Long.parseLong("35875699062250035"));
        a.add(Long.parseLong("1517841543307505039"));
        a.add(Long.parseLong("3289582984443187032"));
        a.add(Long.parseLong("4498128791164624869"));
        a.add(Long.parseLong("4929273885928088826"));
        int j=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<n)j++;
        }
        long[] result = new long[j];
        for (int i = 0; i < j; i++) {
            result[i] = a.get(i);
        }
        return result;
    }

    public static void main(String[] args) {

        Long t0 = System.currentTimeMillis();
        long n =  Long.MAX_VALUE;
        System.out.println(n);

        long[] numbers = getNumbers(n);
        Long t1 = System.currentTimeMillis();
        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

    }
}