package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
   String name;
    int age;
    int weight;
    String address;
    String color;




    public void initialize(String name) {
        this.name = name;
        this.age = 6;
        this.weight = 7;
        this.color = "black";
        this.address = null;


    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
        this.address = null;

    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 6;
        this.color = "black";
        this.address = null;

    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 6;
        this.address = null;
        this.name = null;
    }
    public void initialize(int weight, String color ,String address) {
        this.name = null;
        this.age = 7;
        this.weight = weight;
        this.color = color;
        this.address = address;
        
    }
   

    public static void main(String[] args) {

    }
}
