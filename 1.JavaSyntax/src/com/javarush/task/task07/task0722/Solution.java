package com.javarush.task.task07.task0722;

import java.io.*;
import java.util.*;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String>list = new ArrayList<>();
    String s =reader.readLine();
    
    for(int i=0;!(s.equals("end"));++i){
        list.add(s);
        System.out.println(s);
        s=reader.readLine();
    
    }
}}