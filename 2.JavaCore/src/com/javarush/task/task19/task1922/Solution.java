package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("A");
        words.add("B");
        words.add("C");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        String str = reader.readLine();
        BufferedReader fr =new BufferedReader(new FileReader(str));

        reader.close();

        while(fr.ready())
        {
            String line = fr.readLine();
            String[] list  =  line.split(" ");

            int count = 0;

            for(String lists : list)
            {

                for(String word : words)
            {
                if(lists.equals(word))
                {
                    ++count;
                }
            }
            }

            if(count == 2)
            {
                System.out.println(line);
            }


        }
        fr.close();
    }
}
