package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fis = null;



            while(true)
            {
                String s = reader.readLine();

                try
                {
                    fis = new FileInputStream(s);
                    fis.close();
                }
                catch(FileNotFoundException e)
                {
                    System.out.println(s);
                    reader.close();
                    return;
                }

            }



        }





    }

