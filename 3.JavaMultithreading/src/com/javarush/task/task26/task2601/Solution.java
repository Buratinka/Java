package com.javarush.task.task26.task2601;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {


        double median = 0;

        Arrays.sort(array);

        if(array.length % 2 == 1)
        {
            median = array[array.length/2];
        }
        if(array.length % 2 == 0)
        {
            median = (array[array.length/2] + array[array.length/2-1])/2;
        }


        final int d = (int)median;

        Arrays.sort(array,(x,y) -> Integer.compare(Math.abs(d - x), Math.abs(d - y)));

        return array;
    }
}
