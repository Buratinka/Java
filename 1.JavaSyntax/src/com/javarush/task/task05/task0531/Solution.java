package com.javarush.task.task05.task0531;

import java.io.*;
import java.util.*;


/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        

        
        int minimum = min(a, b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b,int c,int d,int e) {
        
     int arr [] = new int [] {a,b,c,d,e};
     Arrays.sort(arr);
        return arr[0];
    }
     
         
    
}
