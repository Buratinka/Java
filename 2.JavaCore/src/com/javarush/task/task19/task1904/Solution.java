package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PersonScannerAdapter psa = new PersonScannerAdapter(sc);
        psa.read();

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner){this.fileScanner = fileScanner;}
        @Override
        public Person read() throws IOException {


            Person person = null;
            if(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();

                String [] str = line.split(" ");

                String firstName = str[1];
                String lastName = str[0];
                String middleName = str[2];

                Calendar calendar = new GregorianCalendar(Integer.parseInt(str[5]), Integer.parseInt(str[4])-1, Integer.parseInt(str[3]));


                person = new Person(firstName,middleName,lastName,calendar.getTime());

            }

            return person;
        }

        @Override
        public void close() throws IOException {

            fileScanner.close();
        }
    }
}
