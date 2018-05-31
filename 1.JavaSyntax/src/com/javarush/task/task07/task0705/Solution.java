package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];
        int[] num2 = new int[10];
        int[] num3 = new int[10];
        
        
        for(int i=0;i<20;++i)
        {
        num[i] =Integer.parseInt(reader.readLine());
        }
        for(int i=0;i<10;++i)
        {
        num2[i] =num[i];
        }
        for(int i=0;i<10;++i)
        {
        num3[i] =num[i+10];
        System.out.println(num3[i]);
        }
        
        
        
       
        
    }
}
