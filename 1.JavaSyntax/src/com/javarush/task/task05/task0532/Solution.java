package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.*;
/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        
        
        int n = Integer.parseInt(reader.readLine());
        if(n>0){
        int arr [] = new int [n];
        for(int i=0;i<n;++i)
        {
            int x = Integer.parseInt(reader.readLine());
            arr[i]=x;
        }

       
     
     Arrays.sort(arr);
     maximum = arr[n-1];
     
     System.out.println(maximum);
    }
    
}}
