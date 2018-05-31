package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]>list = new ArrayList();
        int[]w1=new int[]{0,1,2,3,4};
        int[]w2=new int[]{0,1};
        int[]w3=new int[]{0,1,2,3};
        int[]w4=new int[]{0,1,2,3,4,5,6};
        int[]w5=new int[]{};
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
