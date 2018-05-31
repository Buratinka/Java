package com.javarush.task.task07.task0701;

import java.io.*;
import java.util.*;


/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int b []=new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<b.length;++i)
        {
            b[i]=Integer.parseInt(reader.readLine());
        }
        return b;
    }

    public static int max(int[] array) {
        int maxi=array[0];
        for(int i=0;i<array.length;++i)
        {
        if(array[i]>maxi)
        maxi=array[i];
        }
        return maxi;
    }
}
