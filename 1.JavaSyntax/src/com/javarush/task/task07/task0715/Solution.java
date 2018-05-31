package com.javarush.task.task07.task0715;

import java.io.*;
import java.util.*;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("мама");
        arr.add("именно");
        arr.add("мыла");
        arr.add("именно");
        arr.add("раму");
        arr.add("именно");
        
        for(int i =0;i<arr.size();++i)
        {
            System.out.println(arr.get(i));
        }
        
    }
}
