package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader str = new BufferedReader(new FileReader(reader.readLine()));

        StringBuilder sb = new StringBuilder();


        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> finalyList = new ArrayList<>();

        String line;

        while((line = str.readLine()) != null)
        {
            firstList.add(line);
        }


        for(int i =0;i<firstList.size();++i)
        {
            sb.append(firstList.get(i));
            sb.append(" ");
        }


        Collections.addAll(finalyList, sb.toString().split("\\s"));


        for(int i = 0; i < finalyList.size();++i)
        {
            for(int j = i+1;j<finalyList.size();++j)
            {
                String first = finalyList.get(i);
                String second = new StringBuilder(finalyList.get(j)).reverse().toString();

                if(first.equals(second))
                {
                    Pair pair = new Pair();
                    pair.first = first;
                    pair.second = new StringBuilder(second).reverse().toString();
                    if(!result.contains(pair))
                    result.add(pair);
                }
            }
        }

        for(Pair p : result)
        {
            System.out.println(p);
        }


    }

    public static class Pair {
        String first;
        String second;

        public Pair(){}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
