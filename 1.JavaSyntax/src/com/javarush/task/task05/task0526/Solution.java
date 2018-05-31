package com.javarush.task.task05.task0526;
import java.util.*;
/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("1dfhd ",1," 1fdhdfh");
        Man man2 = new Man("1dfh ",1," 1dfh");
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(man2.name+" "+man2.age+" "+man2.address);
        Woman woman1=new Woman("1dhf ",1," 1fdhdh");
        Woman woman2=new Woman("1dfhfdh ",1," 1dfhdh");
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
        
    }

    public static class Man
        {
            String name;
            int age;
            String address;
            
            public Man(String name,int age,String address)
            {
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public Man(int age,String address)
            {
                
                this.age = age;
                this.address = address;
            }
            public Man(String name,int age)
            {
                this.name = name;
                this.age = age;
                
            }
        }
        public static class Woman
        {
            String name;
            int age;
            String address;
            
            public Woman(String name,int age,String address)
            {
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public Woman(int age,String address)
            {
                
                this.age = age;
                this.address = address;
            }
            public Woman(String name,int age)
            {
                this.name = name;
                this.age = age;
                
            }
            
        }
}
