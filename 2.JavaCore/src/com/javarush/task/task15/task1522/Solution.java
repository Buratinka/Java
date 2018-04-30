package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import static com.javarush.task.task15.task1522.Planet.EARTH;
import static com.javarush.task.task15.task1522.Planet.MOON;
import static com.javarush.task.task15.task1522.Planet.SUN;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {



    public static void main(String[] args){


    }

    public static Planet thePlanet;

    static
    {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {

        }
    }

    public static void readKeyFromConsoleAndInitPlanet()  throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if(s.equals(SUN)){thePlanet=Sun.getInstance();}else
        if(s.equals(MOON)){thePlanet=Moon.getInstance();}else
        if(s.equals(EARTH)){thePlanet=Earth.getInstance();}else
            thePlanet = null;
    }
}
