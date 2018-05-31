package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        
       
        ArrayList<Integer> list = new ArrayList<Integer>();
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int tempRep = 1, maxRep = 0; //вводим пару переменных, накапливающих длину последовательности, одну временную, другую для хранения максимальной длины

for (int i = 0; i < 10; i++) {
    list.add(Integer.parseInt(reader.readLine()));
    if (i > 0) {
        if (list.get(i) == list.get(i-1)) { //сравниваем текущее и предыдущее введенные числа, если одинаковые, увеличиваем временную последовательность
            tempRep++;
            if (tempRep > maxRep) {maxRep = tempRep;}
        }
        else if (tempRep > maxRep) { //обновляем максимальную длину, сбрасываем временную на 1
            maxRep = tempRep;
            tempRep = 1;
        }
        else {tempRep = 1;} //если обновлять максимальную длину не нужно, просто сбрасываем временную
    }
}

System.out.println(maxRep);
    }
    }
