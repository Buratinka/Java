package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> parts = new ArrayList<>();

        FileInputStream fis = null;

        String s = null;

        while (true) {
            if ("end".equals(s = reader.readLine())) break;
            else parts.add(s);
        }
        reader.close();

        Collections.sort(parts);

        String outputFileName = parts.get(0).split(".part")[0];

        FileOutputStream fos = new FileOutputStream(outputFileName);

        //Сливаем файлы
        for (String partsFileNames : parts) {

            fis = new FileInputStream(partsFileNames);

            byte[] buffer = new byte[fis.available()];

            fis.read(buffer);

            fos.write(buffer);

            fis.close();
        }
        fos.close();
        System.out.println("Объединение файлов выполнено!");
    }
}

