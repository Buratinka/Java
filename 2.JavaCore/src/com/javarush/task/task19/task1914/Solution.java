package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        ByteArrayOutputStream outS = new ByteArrayOutputStream();
        PrintStream ps2 = new PrintStream(outS);

        System.setOut(ps2);

        testString.printSomething();


        String [] line = outS.toString().split(" ");

        int res = 0;

       switch (line[1])
       {
           case "+" :
               res = Integer.parseInt(line[0])+Integer.parseInt(line[2]);
               break;
           case "-" :
               res = Integer.parseInt(line[0])-Integer.parseInt(line[2]);
               break;
           case "*" :
               res = Integer.parseInt(line[0])*Integer.parseInt(line[2]);
               break;
       }

       System.setOut(ps);


        System.out.println(line[0]+ " " + line[1] + " " + line[2] +" = "+ res);


        System.out.println();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

