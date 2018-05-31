package com.javarush.task.task05.task0529;


import java.io.*;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      int sum = 0; String s = ""; BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); s = reader.readLine(); while (!s.equals("сумма")) { sum += Integer.parseInt(s); s = reader.readLine(); } System.out.println(sum);
    }
}

