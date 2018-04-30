package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count =0;

        String firstFile = reader.readLine();
        String secondFile = reader.readLine();


        reader.close();

        FileReader fr = new FileReader(firstFile);
        FileWriter fw = new FileWriter(secondFile);

        while(fr.ready())
        {
            int read = fr.read();
            count++;
            if(count%2==0)
            {
            fw.write(read);
            }
        }

        fr.close();
        fw.close();

    }
}
