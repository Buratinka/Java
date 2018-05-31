package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person>list = new ArrayList();

        while(true)
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String name = reader.readLine();



            list.add(new Person(city,name));
        }


            String n = reader.readLine();

        for(Person person:list)
        {
        if(person.city.equals(n))
        {
            System.out.println(person.name);
        }
        }





  }

   static class Person
   {
       String city;
       String name;

       Person(String city,String name)
       {
           this.city=city;
           this.name=name;
       }

   }


}
