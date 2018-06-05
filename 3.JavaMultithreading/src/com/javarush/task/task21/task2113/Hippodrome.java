package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hippodrome {

    private List<Horse> horses;
    private static int countRun = 100;


    public static Hippodrome game;

    public Hippodrome(List<Horse> horses)
    {
        this.horses = horses;
    }


    public static void main(String[] args) throws InterruptedException {


        List<Horse> horses = new ArrayList<Horse>();

        Horse horse1 = new Horse("First",3,0);
        Horse horse2 = new Horse("Second",3,0);
        Horse horse3 = new Horse("Third",3,0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);

        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses()
    {
        return this.horses;
    }

    public void run() throws InterruptedException {
        for(int i=0;i<countRun;++i)
        {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move()
    {
        for(Horse call : horses)
        {
            call.move();
        }
    }
    public void print()
    {
        for(Horse call : horses)
        {
            call.print();
        }

        for(int i=0;i<10;++i)
        {
            System.out.println("");
        }


    }

    public Horse getWinner()
    {

        Horse winner = null;
        double win = 0.0;
        for(Horse hor : horses)
        {
            if(hor.getDistance() > win )
            {
                win = hor.getDistance();
                winner = hor;
            }
        }

        return winner;

    }


    public void printWinner()
    {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }



}
