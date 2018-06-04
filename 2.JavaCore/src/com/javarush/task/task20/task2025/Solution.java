package com.javarush.task.task20.task2025;

import java.io.IOException;

/*
Алгоритмы-числа
*/
public class Solution {

    public static long[] getNumbers(long N)
    {
        String[] lengthWorld = new String[0];
        Long[] num = new Long[lengthWorld.length];
        double finalyLong = 0;
        long[] result = null;

        String world = "" + N;

        lengthWorld = world.split("");

        if (N < Long.MAX_VALUE) {



            for (int i = 0; i < lengthWorld.length; ++i) {


                num[i] = Long.parseLong(lengthWorld[i]);

                finalyLong += Math.pow(Double.parseDouble(String.valueOf(num[i])), Integer.parseInt(String.valueOf(num.length)));

            }


            if (Long.parseLong(String.valueOf(finalyLong)) == N) {

                for (int i = 0; i < num.length; ++i) {
                    result[i] = N;
                }
            }
        }

        else
            if(N < 0 || N > Long.MAX_VALUE || N == Long.MAX_VALUE )
        {
            System.out.println("Ho");
        }



        return result;
    }

    public static void main(String[] args) throws IOException {

        getNumbers(370);

    }
}
