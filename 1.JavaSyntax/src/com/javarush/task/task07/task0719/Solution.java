package com.javarush.task.task07.task0719;

import java.io.*;
import java.util.*;


/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<10;++i)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        
        for(int i =10;i>0;--i)
        {
            System.out.println(list.get(i-1));
        }
        
    }
}
