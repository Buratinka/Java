package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/*
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;

    static
    {
        int a=0,b=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());

            reader.close();
        }catch(IOException e)
        {
            System.out.println("sd");
        }

        A = a;
        B = b;
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
