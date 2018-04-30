package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Movable
    {
        Double speed();
    }
    interface  Flyable extends Movable
    {
        public default Double speed(Flyable r){return 2.0;}
    }
}