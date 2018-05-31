package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();


        for(int i=0;i<10;++i)
        {
            map.put("huylov"+i,390+i*20);
        }

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair: copy.entrySet())
        {
            for (Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator(); iter.hasNext(); )
            {
                Map.Entry<String, Integer> temp = iter.next();
                if (temp.getValue()<500)
                {
                    iter.remove();
                }
        }
        }}


    public static void main(String[] args) {


    }
}