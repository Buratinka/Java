package com.javarush.task.task29.task2909.human;

public class Soldier extends Human {

    private static boolean isSoldier;



    public Soldier(String name, int age) {
        super(name,age);
    }

    public void fight() {
    }

    public void live() {
       fight();
    }
}
