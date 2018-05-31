package com.javarush.task.task07.task0711;

import java.io.*;
import java.util.*;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i<5;++i)
        {
            list.add(reader.readLine());
        }
        
        
        String last;
        for (int i = 0; i < 13; i++) {
            last = list.get(4);
            list.remove(4);
            list.add(0, last);
        }

        for (String s : list) {
            System.out.println(s);
}
        
    
    }
}
