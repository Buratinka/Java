package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        FileInputStream f = new FileInputStream(s);
        Map<Integer,Integer>map = new HashMap<>();

        int a =0;

        while(f.available()>0)
{
    int i = f.read();
    map.put(i,a);
}

int r [] = new int[map.size()];
int g =0;
for(Integer entry : map.keySet())
{

    r[g]=entry;
    ++g;
}

        Arrays.sort(r);
for(int i=0;i<r.length;++i){
        System.out.print(r[i]+" ");}
        reader.close();
        f.close();
    }
}
