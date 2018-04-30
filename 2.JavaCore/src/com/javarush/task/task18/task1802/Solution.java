package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {Scanner scn = new Scanner(System.in);
        String filename = scn.nextLine();
        int k=0;
        int k1=10000;

        FileInputStream fileInputStream = new FileInputStream(filename);


        while (fileInputStream.available()>0)
        {
            k = fileInputStream.read();
            if (k1 > k)
            {
                k1 = k;
            }
        }


        fileInputStream.close();

        System.out.println(k1);
    }
}
