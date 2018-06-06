package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {


        if (string == null || string.isEmpty())
            throw new TooShortStringException();


        String[] str = string.split(" ");

        if (str.length < 5) {
            throw new TooShortStringException();
        }

        int count = 0;
        int countLastIndex = 0;


        for (String var : str) {
            ++count;
            if (count == 5) {
                countLastIndex = string.indexOf(var) + var.length();

                string = string.substring(string.indexOf(" ") + 1, countLastIndex);

            }
        }


        return string;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
