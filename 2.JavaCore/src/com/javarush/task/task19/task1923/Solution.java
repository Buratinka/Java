package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));



        while(reader.ready())
        {
            String[]str1 = reader.readLine().split(" ");

            for(String chk : str1)
            {
                if(!chk.matches("^\\D*$"))
                {
                    writer.write(chk + " ");
                }
            }
        }

        reader.close();
        writer.close();

    }
}
