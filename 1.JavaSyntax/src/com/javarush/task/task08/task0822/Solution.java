package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Integer.MAX_VALUE;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int min = MAX_VALUE;

               Iterator<Integer> it = array.iterator();
               while(it.hasNext())
               {
                   int sin = it.next();
                   if(sin<min)
                   {
                       min=sin;
                   }
               }



        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        for(int i=0;i<N;++i)
        {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        return list;
    }
}
