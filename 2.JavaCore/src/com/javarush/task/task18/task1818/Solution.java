package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1 = reader.readLine();
        String f2 = reader.readLine();
        String f3 = reader.readLine();

        reader.close();

        FileOutputStream fw1 = new FileOutputStream("C:\\Users\\Олег\\Desktop\\"+f1+".txt",true);
        FileInputStream fr2 = new FileInputStream("C:\\Users\\Олег\\Desktop\\"+f2+".txt");
        FileInputStream fr3 = new FileInputStream("C:\\Users\\Олег\\Desktop\\"+f3+".txt");



        while(fr2.available()>0)
        {
            byte[] buf = new byte[fr2.available()];
            fr2.read(buf);
            fw1.write(buf);
        }

        fr2.close();

        while(fr3.available()>0)
        {
            byte[] buf = new byte[fr3.available()];
            fr3.read(buf);
            fw1.write(buf);
        }



        fr3.close();
        fw1.close();


    }
}

