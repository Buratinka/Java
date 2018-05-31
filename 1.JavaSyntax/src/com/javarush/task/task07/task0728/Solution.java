package com.javarush.task.task07.task0728;

import java.io.*;
import java.util.*;
/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
         int a=0;
         for(int i=0;i<20;++i)
         {
             for(int j=0;j<20;++j){
            if(array[j]<array[i])
            {
            a=array[j];
            array[j]=array[i];
            array[i]=a;
            }
             }
         }
    }
}
