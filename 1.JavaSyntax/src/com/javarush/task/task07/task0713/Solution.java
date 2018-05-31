package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        
         ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> elseee = new ArrayList<>();
        for(int i = 0;i < 20;i++){
            arr.add(Integer.parseInt(reader.readLine()));
            if(arr.get(i)%3 == 0 && arr.get(i)%2 ==0){
                num3.add(arr.get(i));
                num2.add(arr.get(i));
            }
            else if (arr.get(i)%3 == 0){
                num3.add(arr.get(i));
            }
            else if(arr.get(i)%2 == 0){
                num2.add(arr.get(i));
            }
            else {
                elseee.add(arr.get(i));
            }
        }
        printList(num3);
        printList(num2);
        printList(elseee);

        
        
    }

    public static void printList(List<Integer> list) {
       for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
}
    }
}
