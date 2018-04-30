package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strRLine = reader.readLine();

        reader.close();

        PrintStream consStrm = System.out;
        ByteArrayOutputStream outStrm = new ByteArrayOutputStream();
        PrintStream prtStrm = new PrintStream(outStrm);
        System.setOut(prtStrm);

        testString.printSomething();

        System.setOut(consStrm);

        FileOutputStream fOutStrm = new FileOutputStream(strRLine);
        outStrm.writeTo(fOutStrm);

        System.out.println(outStrm.toString());

        fOutStrm.close();


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

