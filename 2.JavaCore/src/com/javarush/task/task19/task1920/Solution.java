package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(args[0]);

        BufferedReader reader = new BufferedReader(fr);



        double max = Double.MIN_VALUE;

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

            if(Double.parseDouble(arr[1])>max)max = Double.parseDouble(arr[1]);

        }



        for(Map.Entry<String,Double> m : map.entrySet())
        {

            if(m.getValue().equals(max)){System.out.println(m.getKey());}

        }


        fr.close();
        reader.close();



    }
}
