package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(reader.readLine());
        
        while(num>0)
        {
            if(num%2==0)
            {
            ++even;
            num/=10;
                
            }
            else
            {
                ++odd;
                num/=10;
            }
        }
         System.out.println("Even: " + even + " Odd: " + odd);
        
    }
}
