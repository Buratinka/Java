package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public static Properties propties = new Properties();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        InputStream fis = new FileInputStream(fileName);

        load(fis);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод

        propties.clear();

        for(Map.Entry<String,String> map : properties.entrySet())
        {
            propties.put(map.getKey(),map.getValue());
        }


        propties.store(outputStream,"Hey object!");

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод


     propties.load(inputStream);

     for(Map.Entry<Object,Object> map : propties.entrySet())
     {

         properties.put(map.getKey().toString(),map.getValue().toString());

     }

    }

    public static void main(String[] args) {

    }
}
