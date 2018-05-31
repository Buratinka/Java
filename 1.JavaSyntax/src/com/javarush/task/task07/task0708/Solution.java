package com.javarush.task.task07.task0708;

import java.io.*;
import java.util.*;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

for (int i = 0; i < 5; i++) 
       strings.add(reader.readLine());

Collections.sort(strings, (s1, s2) -> s2.length() - s1.length());
int length = strings.get(0).length();
for (String string : strings)
     if (length == string.length())
         System.out.println(string);
}
}
