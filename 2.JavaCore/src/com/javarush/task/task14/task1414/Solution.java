package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        ArrayList<String> list = new ArrayList();
        do
        {
            s = reader.readLine();
            list.add(s);
            if(!(s.equals("cartoon")||s.equals("thriller")||s.equals("soapOpera")))
            {
                break;
            }




        }while(s.equals("cartoon")||s.equals("thriller")||s.equals("soapOpera"));

        for(int i =0;i<list.size();++i)
        {

            String f =list.get(i);

            Movie movie ;
            movie = MovieFactory.getMovie(f);
            if(f.equals("cartoon")||f.equals("thriller")||f.equals("soapOpera"))
            {

                System.out.println(movie.getClass().getSimpleName());
            }


        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
            }
            else
            if("cartoon".equals(key))
            {
                movie = new Cartoon();
            }
            else
            if("thriller".equals(key))
            {
                movie = new Thriller();
            }




            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{}
    static class Thriller extends Movie{}

}
