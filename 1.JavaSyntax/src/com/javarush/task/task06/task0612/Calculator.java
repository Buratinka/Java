package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    static public int sum=0;
    static public double sum1=0;
    public static int plus(int a, int b) {
        sum=a+b;
        return sum;
    }

    public static int minus(int a, int b) {
        sum=a-b;
        return sum;
    }

    public static int multiply(int a, int b) {
        sum=a*b;
        return sum;
    }

    public static double division(int a, int b) {
        double a1=a;
        double b1=b;
        sum1=a1/b1;
        return sum1;
    }

    public static double percent(int a, int b) {
         double a1=a;
        double b1=b;
        sum1=(a1 * b1)/100;
        return sum1;
    }

    public static void main(String[] args) {

    }
}