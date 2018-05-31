package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        
        for(int i=0;i<10;++i)
        {
            list.add(reader.readLine());
        }
        
        String h = "1";
        
        
        for(int i=0;i<10;++i)
        {
            if(list.get(i).length()>=h.length()){h=list.get(i);}
            else if(list.get(i).length()<h.length()){System.out.print(i);}
        }
        
    }
}

