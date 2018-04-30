package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        String str = "";

        while (reader.ready()){
            str += (char)reader.read();
        }

        str = str.replace('.','!');

            writer.write(str);
            
        bufferedReader.close();
        reader.close();
        writer.close();
    }
}
