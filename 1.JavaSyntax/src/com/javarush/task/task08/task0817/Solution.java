package com.javarush.task.task08.task0817;

import java.util.*;
import java.io.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();


        map.put("0","vasichkin");
        map.put("1","vasichkin");
        map.put("2","vasichkin");
        map.put("3","vasichkin");
        map.put("4","vasichkin");
        map.put("5","vasichkin");
        map.put("6","vasichkin");
        map.put("7","vasichkin");
        map.put("8","vasichkin");
        map.put("9","vasichkin");



        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String,String> copy = new HashMap<String, String>(map);
        //прогоняем копию по имени в поисках соответствий в оригинальном ХэшМап
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            //с помощью итератора удаляем позиции из оригинала совпадающие по НЕуникальному имени и НЕсовпадающие по уникальному ключу
            for (Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
                Map.Entry<String, String> temp = iter.next();
                if (pair.getValue().equals(temp.getValue())&&!pair.getKey().equals(temp.getKey())) iter.remove();
            }
        }
        String s="";
        removeItemFromMapByValue(map,s);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                copy.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
