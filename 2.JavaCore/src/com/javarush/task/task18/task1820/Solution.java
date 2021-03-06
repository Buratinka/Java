package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        //Читаем файл
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader f1 = new BufferedReader(new FileReader(fileName1));

        while (f1.ready())
            list.add(f1.readLine());
        f1.close();

        ArrayList<Long> values = new ArrayList<Long>();
        for (String s : list) {
            for (String part : s.split(" ")) {
                double a = Double.parseDouble(part);
                values.add(Math.round(a));
            }
        }
        f1.close();

        FileWriter fw = new FileWriter(fileName2);

        for(Long v : values)
        {
            fw.write(v.toString()+" ");
        }

        fw.close();

    }
}
