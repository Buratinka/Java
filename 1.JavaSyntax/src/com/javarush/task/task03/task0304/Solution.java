package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static int addTenPercent(int i) {
        //напишите тут ваш код
        return i + (i / 10);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
