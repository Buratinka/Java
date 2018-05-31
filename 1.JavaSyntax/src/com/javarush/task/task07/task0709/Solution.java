package com.javarush.task.task07.task0709;

import java.io.*;
import java.util.*;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        int min = list.get(list.size()-1).length();
        for(int a = 0; a < list.size(); a++){
            if(list.get(a).length() < min){
                min = list.get(a).length();
            }
        }
        for(int b = 0; b < list.size(); b++){
            if(list.get(b).length() == min){
                System.out.println(list.get(b));
            }
        }
    }
}
