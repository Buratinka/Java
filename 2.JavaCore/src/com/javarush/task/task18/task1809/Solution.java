package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream = new FileOutputStream(name2);



        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) {

            list.add(inputStream.read());
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); ++i) {
            outputStream.write(list.get(i));
        }


        inputStream.close();
        outputStream.close();

    }
}
