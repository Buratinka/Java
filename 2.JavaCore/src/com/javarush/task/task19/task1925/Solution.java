package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {



        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

        String outFile = "";

        while(fileReader.ready())
        {


            String file = fileReader.readLine();
            String [] words = file.split(" ");

            for(int i=0;i<words.length;++i)
            {
                if(words[i].length() > 6)
                {

                    outFile += words[i] + ",";

                }
            }
        }


        outFile = outFile.substring(0,outFile.length()-1);
        fileWriter.write(outFile);

        fileReader.close();
        fileWriter.close();



    }
}
