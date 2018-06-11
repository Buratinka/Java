package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiyv");
        map.put("age",null);

        System.out.println(getQuery(map));

    }
    public static String getQuery(Map<String, String> params) {

        String str = "";
        StringBuilder result = new StringBuilder();

        int count = 0;

        for(Map.Entry map : params.entrySet())
        {
            if(map.getValue() != null)
            {
                ++count;
            }
        }

        for(Map.Entry map : params.entrySet())
        {


            if(map.getValue() != null)
            {
                str = map.getKey() +" = '"+map.getValue()+"'";
                result.append(str);
                if(count-1 > 0)
                {
                    result.append(" and ");
                    --count;
                }

            }


        }

        return result.toString();
    }
}
