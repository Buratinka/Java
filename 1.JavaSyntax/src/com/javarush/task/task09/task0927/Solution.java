package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Vas`ka",new Cat("Vas`ka"));
        map.put("Vas`kka",new Cat("Vas`kka"));
        map.put("Vas`kaa",new Cat("Vas`kaa"));
        map.put("Vas`kkka",new Cat("Vas`kkka"));
        map.put("Vas`kaaa",new Cat("Vas`kaaa"));
        map.put("Vas`kkaa",new Cat("Vas`kkaa"));
        map.put("Vas`kaka",new Cat("Vas`kaka"));
        map.put("Vas`kaak",new Cat("Vas`kaak"));
        map.put("Vas`aaka",new Cat("Vas`aaka"));
        map.put("Vas`akaa",new Cat("Vas`akaa"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet();
        for (Map.Entry<String,Cat> pair: map.entrySet() ) {
            Cat a = pair.getValue();
            cats.add(a);
        }

        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
