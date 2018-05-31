package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();

        Map<String,Integer> month = new HashMap();

        month.put("January",1);
        month.put("February",2);
        month.put("March",3);
        month.put("April",4);
        month.put("May",5);
        month.put("June",6);
        month.put("Jule",7);
        month.put("August",8);
        month.put("September",9);
        month.put("October",10);
        month.put("November",11);
        month.put("December",12);

        Iterator<Map.Entry<String, Integer>> it = month.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String, Integer> pair = it.next();
            if(pair.getKey().equals(a))
            {
                String key = pair.getKey();
                Integer value = pair.getValue();
                System.out.println(key+" is "+value+" month");
            }
        }
    }
}
