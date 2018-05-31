package com.javarush.task.task07.task0720;

import java.io.*;
import java.util.*;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list=new ArrayList<>();
   int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < m; i++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }



        for (String s : list) {
            System.out.println(s);
        }

        
    }
}
