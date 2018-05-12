package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        reader.close();

//String nameFile = "/home/oleg/newfile.txt";

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile));

        while(fileReader.ready())
        {
            String file = new StringBuffer((fileReader.readLine())).reverse().toString();
            System.out.println(file);
            }

            fileReader.close();

    }
}
