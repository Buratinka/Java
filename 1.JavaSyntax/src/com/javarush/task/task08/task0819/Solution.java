package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {

        Set<Cat> cats = createCats();

        Iterator<Cat> iter = cats.iterator();

        Cat cat = new Cat();
        
        while (iter.hasNext())
        {
            cat = iter.next();
        }
        cats.remove(cat);

        printCats(cats);

    }

    public static Set<Cat> createCats() {
        Set set = new HashSet();
        for(int i =0;i<3;++i)
        {
            set.add(new Cat());
        }
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
       for(Cat c : cats)
       {
          System.out.println(c);
       }
    }

    public static class Cat

    {

    }
}
