package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

import java.io.IOException;

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();


    }

    public static class RacingClock extends Thread {
        public RacingClock(){

            start();
        }

        public void run() {


                try {
                    while(countSeconds>=1) {


                    System.out.print(countSeconds+" ");
                    --countSeconds;

                    Thread.sleep(1000);
                    }
                }
                catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }

            System.out.println("Марш!");
            }

        }
    }

