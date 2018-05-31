package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int iq;
        private boolean sex;
        private String name;
        private int weight;
        private int length;

        public Human(int age,int iq){}
        public Human(int age,int iq,boolean sex){}
        public Human(int age,int iq,boolean sex,String name){}
        public Human(int age,int iq,String name,int weight){}
        public Human(int age,int iq,boolean sex,String name,int weight,int length){}
        public Human(boolean sex,String name,int weight,int length){}
        public Human(int age,int iq,boolean sex,String name,int length){}
        public Human(int age,int iq,String name,int weight,int length){}
        public Human(int age,int iq,boolean sex,int weight,int length){}
        public Human(int iq,boolean sex,String name,int weight,int length){}


    }
}
