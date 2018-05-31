package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader oop = new  BufferedReader(new InputStreamReader(System.in));

        String age = oop.readLine();
        int age1 = Integer.parseInt(age);

        if(age1<18)
        {
            System.out.println("Подрасти еще");
        }else if(age1>=18);

    }
}
