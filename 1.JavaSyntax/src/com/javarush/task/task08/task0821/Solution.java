package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> people = new HashMap<>();
        people.put("1","oo");
        people.put("1wq","oo");
        people.put("1","oo");
        people.put("1e","ooe");
        people.put("w1","woo");
        people.put("1we","oofef");
        people.put("1weas","oasofef");
        people.put("1sawe","oofsaef");
        people.put("1wase","oasjofef");
        people.put("1wase","ooasfef");


        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
