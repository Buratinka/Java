package com.javarush.task.task07.task0724;


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
            Human add45 = new Human("цу",true,2);
            Human add1 = new Human("цунс",true,2);
            Human add2 = new Human("цус",true,2);
            Human add3 = new Human("цсусц",true,2);
            
            Human add11 = new Human("сцу",true,2,add45,add1);
            Human add12 = new Human("сцус",true,2,add45,add1);
            Human add13 = new Human("сцунс",true,2,add45,add1);
            Human add14 = new Human("сцусн",true,2,add45,add1);
            Human add15 = new Human("цсу",true,2,add45,add1);
            
            ArrayList<Human>list=new ArrayList<>();
            list.add(add45);
            list.add(add1);
            list.add(add2);
            list.add(add3);
            list.add(add11);
            list.add(add12);
            list.add(add13);
            list.add(add14);
            list.add(add15);
            
            for(Human e:list)
            {
                System.out.println(e.toString());
            }
        
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        
        Human father;
        Human mother;
        
        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















