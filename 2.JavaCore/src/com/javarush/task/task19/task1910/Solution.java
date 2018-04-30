package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        StringBuilder builder = new StringBuilder();

        String s = "";
        
        while (reader.ready()){
          s +=(char)reader.read();
        }

       writer.write(s.replaceAll("[\\p{Punct}\\n]",""));

        bufferedReader.close();
        reader.close();
        writer.close();
    }
}
