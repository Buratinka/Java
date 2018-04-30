package com.javarush.task.task19.task1919;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        



        FileReader fr = new FileReader(args[0]);

        BufferedReader reader = new BufferedReader(fr);




        TreeMap<String, Double> map = new TreeMap<>();

            while(reader.ready())
            {
                String []arr = reader.readLine().split(" ");

                if(map.containsKey(arr[0]))
                {
                    map.put(arr[0],map.get(arr[0])+Double.parseDouble(arr[1]));
                }else
                {
                    map.put(arr[0],Double.parseDouble(arr[1]));
                }
            }

            for(Map.Entry<String,Double> pair : map.entrySet())
            {
                System.out.println(pair.getKey()+" "+pair.getValue());
            }

        fr.close();
        reader.close();

    }

    }
