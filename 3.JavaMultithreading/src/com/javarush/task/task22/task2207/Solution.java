package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        reader.close();

        StringBuilder temp = new StringBuilder();

        String s;

        List<String> firstList = new ArrayList<>();
        List<String> finalList = new ArrayList<>();

        BufferedReader readDate = new BufferedReader(new FileReader(name));

        while ((s = readDate.readLine()) != null) {

            firstList.add(s);

        }

        readDate.close();

        for (int i = 0; i < firstList.size(); i++)
        {
            temp.append(firstList.get(i));
            temp.append(" ");
        }



        Collections.addAll(finalList, temp.toString().split("\\s"));

        for (int i = 0; i < finalList.size(); i++)
            for (int j = i+1; j < finalList.size(); j++)
            {
                String first = finalList.get(i);
                String second = new StringBuilder(finalList.get(j)).reverse().toString();

                if (first.equals(second))
                {
                    Pair pair = new Pair();
                    pair.first = first;
                    pair.second = new StringBuilder(second).reverse().toString();
                    if (!result.contains(pair))
                        result.add(pair);
                }
            }

            // my solution almost full, not worked with one leter
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        //String reader = "/home/oleg/newfile2.txt";
//
//        BufferedReader str = new BufferedReader(new FileReader(reader.readLine()));
//
//        StringBuilder sb = new StringBuilder();
//
//
//        while(str.ready())
//        {
//            String ser =str.readLine();
//            sb.append(ser);
//                sb.append(" ");
//
//        }
//
//        String [] words = sb.toString().split(" ");
//
//        List <String> list = new LinkedList();
//
//
//        for(int i=0;i<words.length;++i)
//        {
//            list.add(words[i].trim());
//        }
//
//
//        for(int k=0;k<list.size();++k)
//        {
//
//
//            for(int j=0;j<list.size();++j)
//            {
//
//                String first = list.get(k);
//                StringBuilder sb2 = new StringBuilder(first);
//
//                String reverse = sb2.reverse().toString();
//
//
//                String second = list.get(j);
//                if(reverse.equals(second))
//                {
//
//                    Pair pair = new Pair();
//                    pair.first = first;
//                    pair.second = second;
//                    if (!result.contains(pair))
//                        result.add(pair);
//
//
//                    list.remove(first);
//                    list.remove(second);
//
//
//
//                }
//
//            }
//        }
//
//
//        for(Pair p : result)
//        {
//            System.out.println(p);
//        }

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
