package com.javarush.task.task06.task0610;

import java.io.*;
import java.util.*;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f = reader.readLine();
        return f;

    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(reader.readLine());
        return f;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         double f = Double.parseDouble(reader.readLine());
        return f;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean f = Boolean.parseBoolean(reader.readLine());
        return f;

    }

    public static void main(String[] args) {

    }
}
