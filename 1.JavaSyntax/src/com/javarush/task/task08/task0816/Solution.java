package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for(int i=0;i<10;++i)
        {
            map.put("Stallone"+i, new Date("JUNE 1 1980"+i));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        int month;
        Map.Entry<String, Date> pair;
        while (iterator.hasNext()) {
            pair = iterator.next();
            month = pair.getValue().getMonth();
            if (month > 4 && month < 8) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
